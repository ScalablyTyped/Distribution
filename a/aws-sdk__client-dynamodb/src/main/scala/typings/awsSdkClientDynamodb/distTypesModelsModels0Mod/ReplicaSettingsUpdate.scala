package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaSettingsUpdate extends StObject {
  
  /**
    * <p>The Region of the replica to be added.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be
    *             modified.</p>
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    js.Array[
      typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaGlobalSecondaryIndexSettingsUpdate
    ]
  ] = js.undefined
  
  /**
    * <p>Auto scaling settings for managing a global table replica's read capacity
    *             units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB
    *             returns a <code>ThrottlingException</code>. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
    *                 Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Replica-specific table class. If not specified, uses the source table's table
    *             class.</p>
    */
  var ReplicaTableClass: js.UndefOr[TableClass | String] = js.undefined
}
object ReplicaSettingsUpdate {
  
  inline def apply(): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexSettingsUpdate(value: js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    
    inline def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
    
    inline def setReplicaTableClass(value: TableClass | String): Self = StObject.set(x, "ReplicaTableClass", value.asInstanceOf[js.Any])
    
    inline def setReplicaTableClassUndefined: Self = StObject.set(x, "ReplicaTableClass", js.undefined)
  }
}
