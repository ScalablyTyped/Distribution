package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  
  /**
    * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsSdk.dynamodbMod.IndexStatus] = js.native
  
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
}
object ReplicaGlobalSecondaryIndexAutoScalingDescription {
  
  @scala.inline
  def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  }
  
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexAutoScalingDescriptionMutableBuilder[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
    
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
  }
}
