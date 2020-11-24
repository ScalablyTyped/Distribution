package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.native
  
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[DateType] = js.native
  
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.native
  
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
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
    def setAccessKeyId(value: AccessKeyString): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    
    @scala.inline
    def setExpiration(value: DateType): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    
    @scala.inline
    def setSecretKey(value: SecretKeyString): Self = this.set("SecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("SecretKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: SessionTokenString): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("SessionToken", js.undefined)
  }
}
