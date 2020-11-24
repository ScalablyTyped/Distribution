package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorization extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
    */
  var CdnIdentifierSecret: string = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
    */
  var SecretsRoleArn: string = js.native
}
object Authorization {
  
  @scala.inline
  def apply(CdnIdentifierSecret: string, SecretsRoleArn: string): Authorization = {
    val __obj = js.Dynamic.literal(CdnIdentifierSecret = CdnIdentifierSecret.asInstanceOf[js.Any], SecretsRoleArn = SecretsRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
    
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
    def setCdnIdentifierSecret(value: string): Self = this.set("CdnIdentifierSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsRoleArn(value: string): Self = this.set("SecretsRoleArn", value.asInstanceOf[js.Any])
  }
}
