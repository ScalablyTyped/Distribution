package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The table/index configuration is being updated. The table/index remains available for data operations when UPDATING     DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.IndexStatus] = js.undefined
  
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
}
object ReplicaGlobalSecondaryIndexAutoScalingDescription {
  
  inline def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
    
    inline def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    inline def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
  }
}
