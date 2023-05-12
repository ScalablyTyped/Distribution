package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends StObject {
  
  /**
    * <p>The name of the global secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The current state of the replica global secondary index:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The index is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The table/index configuration is being updated. The
    *                     table/index remains available for data operations when
    *                     <code>UPDATING</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The index is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The index is ready for use.</p>
    *             </li>
    *          </ul>
    */
  var IndexStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.IndexStatus | String] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings for a global table or global secondary
    *             index.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings for a global table or global secondary
    *             index.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
}
object ReplicaGlobalSecondaryIndexAutoScalingDescription {
  
  inline def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setIndexStatus(value: IndexStatus | String): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
    
    inline def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    inline def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
  }
}
