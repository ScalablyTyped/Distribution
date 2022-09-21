package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that use a wildcard for the principal.
    */
  var BlockPublicPolicy: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see Permissions policy examples.
    */
  var ResourcePolicy: NonEmptyResourcePolicyType
  
  /**
    * The ARN or name of the secret to attach the resource-based policy. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
}
object PutResourcePolicyRequest {
  
  inline def apply(ResourcePolicy: NonEmptyResourcePolicyType, SecretId: SecretIdType): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setBlockPublicPolicy(value: BooleanType): Self = StObject.set(x, "BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "BlockPublicPolicy", js.undefined)
    
    inline def setResourcePolicy(value: NonEmptyResourcePolicyType): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
