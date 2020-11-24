package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  /**
    * The access key ID that identifies the temporary security credentials.
    */
  var AccessKeyId: accessKeyIdType = js.native
  
  /**
    * The date on which the current credentials expire.
    */
  var Expiration: dateType = js.native
  
  /**
    * The secret access key that can be used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType = js.native
  
  /**
    * The token that users must pass to the service API to use the temporary credentials.
    */
  var SessionToken: tokenType = js.native
}
object Credentials {
  
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    Expiration: dateType,
    SecretAccessKey: accessKeySecretType,
    SessionToken: tokenType
  ): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], SessionToken = SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: accessKeyIdType): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: dateType): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKey(value: accessKeySecretType): Self = this.set("SecretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionToken(value: tokenType): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
  }
}
