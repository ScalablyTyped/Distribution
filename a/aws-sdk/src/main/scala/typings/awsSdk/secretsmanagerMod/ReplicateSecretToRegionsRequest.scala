package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateSecretToRegionsRequest extends StObject {
  
  /**
    * A list of Regions in which to replicate the secret.
    */
  var AddReplicaRegions: AddReplicaRegionListType
  
  /**
    * Specifies whether to overwrite a secret with the same name in the destination Region.
    */
  var ForceOverwriteReplicaSecret: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The ARN or name of the secret to replicate.
    */
  var SecretId: SecretIdType
}
object ReplicateSecretToRegionsRequest {
  
  inline def apply(AddReplicaRegions: AddReplicaRegionListType, SecretId: SecretIdType): ReplicateSecretToRegionsRequest = {
    val __obj = js.Dynamic.literal(AddReplicaRegions = AddReplicaRegions.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicateSecretToRegionsRequest]
  }
  
  extension [Self <: ReplicateSecretToRegionsRequest](x: Self) {
    
    inline def setAddReplicaRegions(value: AddReplicaRegionListType): Self = StObject.set(x, "AddReplicaRegions", value.asInstanceOf[js.Any])
    
    inline def setAddReplicaRegionsVarargs(value: ReplicaRegionType*): Self = StObject.set(x, "AddReplicaRegions", js.Array(value*))
    
    inline def setForceOverwriteReplicaSecret(value: BooleanType): Self = StObject.set(x, "ForceOverwriteReplicaSecret", value.asInstanceOf[js.Any])
    
    inline def setForceOverwriteReplicaSecretUndefined: Self = StObject.set(x, "ForceOverwriteReplicaSecret", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
