package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndexSettingsUpdate extends StObject {
  
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName
  
  /**
    * Auto scaling settings for managing a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}
object ReplicaGlobalSecondaryIndexSettingsUpdate {
  
  inline def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
  }
  
  extension [Self <: ReplicaGlobalSecondaryIndexSettingsUpdate](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    
    inline def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
  }
}
