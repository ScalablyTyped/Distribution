package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorization extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
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
  implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdnIdentifierSecret(value: string): Self = StObject.set(x, "CdnIdentifierSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsRoleArn(value: string): Self = StObject.set(x, "SecretsRoleArn", value.asInstanceOf[js.Any])
  }
}
