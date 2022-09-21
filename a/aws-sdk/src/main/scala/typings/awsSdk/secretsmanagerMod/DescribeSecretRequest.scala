package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecretRequest extends StObject {
  
  /**
    * The ARN or name of the secret.  For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object DescribeSecretRequest {
  
  inline def apply(SecretId: SecretIdType): DescribeSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecretRequest]
  }
  
  extension [Self <: DescribeSecretRequest](x: Self) {
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
