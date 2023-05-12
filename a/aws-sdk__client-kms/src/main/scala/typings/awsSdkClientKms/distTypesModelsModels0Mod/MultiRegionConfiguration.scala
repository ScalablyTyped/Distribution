package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionConfiguration extends StObject {
  
  /**
    * <p>Indicates whether the KMS key is a <code>PRIMARY</code> or <code>REPLICA</code>
    *       key.</p>
    */
  var MultiRegionKeyType: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.MultiRegionKeyType | String] = js.undefined
  
  /**
    * <p>Displays the key ARN and Region of the primary key. This field includes the current KMS
    *       key if it is the primary key.</p>
    */
  var PrimaryKey: js.UndefOr[MultiRegionKey] = js.undefined
  
  /**
    * <p>displays the key ARNs and Regions of all replica keys. This field includes the current KMS
    *       key if it is a replica key.</p>
    */
  var ReplicaKeys: js.UndefOr[js.Array[MultiRegionKey]] = js.undefined
}
object MultiRegionConfiguration {
  
  inline def apply(): MultiRegionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRegionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMultiRegionKeyType(value: MultiRegionKeyType | String): Self = StObject.set(x, "MultiRegionKeyType", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionKeyTypeUndefined: Self = StObject.set(x, "MultiRegionKeyType", js.undefined)
    
    inline def setPrimaryKey(value: MultiRegionKey): Self = StObject.set(x, "PrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "PrimaryKey", js.undefined)
    
    inline def setReplicaKeys(value: js.Array[MultiRegionKey]): Self = StObject.set(x, "ReplicaKeys", value.asInstanceOf[js.Any])
    
    inline def setReplicaKeysUndefined: Self = StObject.set(x, "ReplicaKeys", js.undefined)
    
    inline def setReplicaKeysVarargs(value: MultiRegionKey*): Self = StObject.set(x, "ReplicaKeys", js.Array(value*))
  }
}
