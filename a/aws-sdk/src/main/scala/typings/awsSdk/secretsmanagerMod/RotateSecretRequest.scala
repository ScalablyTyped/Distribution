package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateSecretRequest extends StObject {
  
  /**
    * A unique identifier for the new version of the secret that helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during rotation. This value becomes the VersionId of the new version. If you use the Amazon Web Services CLI or one of the Amazon Web Services SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request for this parameter. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request. You only need to specify this value if you implement your own retry logic and you want to ensure that Secrets Manager doesn't attempt to create a secret version twice. We recommend that you generate a UUID-type value to ensure uniqueness within the specified secret. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  
  /**
    * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation window. The rotation schedule is defined in RotateSecretRequest$RotationRules. If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by running the  testSecret step of the Lambda rotation function. The test creates an AWSPENDING version of the secret and then removes it. If you don't specify this value, then by default, Secrets Manager rotates the secret immediately.
    */
  var RotateImmediately: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The ARN of the Lambda rotation function that can rotate the secret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined
  
  /**
    * A structure that defines the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.undefined
  
  /**
    * The ARN or name of the secret to rotate. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object RotateSecretRequest {
  
  inline def apply(SecretId: SecretIdType): RotateSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateSecretRequest]
  }
  
  extension [Self <: RotateSecretRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenType): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setRotateImmediately(value: BooleanType): Self = StObject.set(x, "RotateImmediately", value.asInstanceOf[js.Any])
    
    inline def setRotateImmediatelyUndefined: Self = StObject.set(x, "RotateImmediately", js.undefined)
    
    inline def setRotationLambdaARN(value: RotationLambdaARNType): Self = StObject.set(x, "RotationLambdaARN", value.asInstanceOf[js.Any])
    
    inline def setRotationLambdaARNUndefined: Self = StObject.set(x, "RotationLambdaARN", js.undefined)
    
    inline def setRotationRules(value: RotationRulesType): Self = StObject.set(x, "RotationRules", value.asInstanceOf[js.Any])
    
    inline def setRotationRulesUndefined: Self = StObject.set(x, "RotationRules", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
