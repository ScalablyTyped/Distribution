package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateResourcePolicyRequest extends StObject {
  
  /**
    * A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the string identifies who can access or manage this secret and its versions. For example policies, see Permissions policy examples.
    */
  var ResourcePolicy: NonEmptyResourcePolicyType
  
  /**
    * This field is reserved for internal use.
    */
  var SecretId: js.UndefOr[SecretIdType] = js.undefined
}
object ValidateResourcePolicyRequest {
  
  inline def apply(ResourcePolicy: NonEmptyResourcePolicyType): ValidateResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResourcePolicyRequest]
  }
  
  extension [Self <: ValidateResourcePolicyRequest](x: Self) {
    
    inline def setResourcePolicy(value: NonEmptyResourcePolicyType): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretIdUndefined: Self = StObject.set(x, "SecretId", js.undefined)
  }
}
