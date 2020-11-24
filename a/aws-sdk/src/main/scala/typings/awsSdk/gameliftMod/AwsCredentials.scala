package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCredentials extends js.Object {
  
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.native
}
object AwsCredentials {
  
  @scala.inline
  def apply(): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCredentials]
  }
  
  @scala.inline
  implicit class AwsCredentialsOps[Self <: AwsCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKeyId(value: NonEmptyString): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: NonEmptyString): Self = this.set("SecretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("SecretAccessKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: NonEmptyString): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("SessionToken", js.undefined)
  }
}
