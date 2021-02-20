package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaGlobalSecondaryIndexSettingsUpdate extends StObject {
  
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  
  /**
    * Auto scaling settings for managing a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}
object ReplicaGlobalSecondaryIndexSettingsUpdate {
  
  @scala.inline
  def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
  }
  
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexSettingsUpdateMutableBuilder[Self <: ReplicaGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    
    @scala.inline
    def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
  }
}
