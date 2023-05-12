package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableSettingsInput extends StObject {
  
  /**
    * <p>The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not
    *             specified, the global table defaults to <code>PROVISIONED</code> capacity billing
    *             mode.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>PROVISIONED</code> - We recommend using <code>PROVISIONED</code> for
    *                     predictable workloads. <code>PROVISIONED</code> sets the billing mode to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual">Provisioned Mode</a>.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PAY_PER_REQUEST</code> - We recommend using <code>PAY_PER_REQUEST</code>
    *                     for unpredictable workloads. <code>PAY_PER_REQUEST</code> sets the billing mode
    *                     to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand">On-Demand Mode</a>. </p>
    *             </li>
    *          </ul>
    */
  var GlobalTableBillingMode: js.UndefOr[BillingMode | String] = js.undefined
  
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be
    *             modified.</p>
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    js.Array[
      typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ]
  ] = js.undefined
  
  /**
    * <p>The name of the global table</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Auto scaling settings for managing provisioned write capacity for the global
    *             table.</p>
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a
    *                 <code>ThrottlingException.</code>
    *          </p>
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Represents the settings for a global table in a Region that will be modified.</p>
    */
  var ReplicaSettingsUpdate: js.UndefOr[
    js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaSettingsUpdate]
  ] = js.undefined
}
object UpdateGlobalTableSettingsInput {
  
  inline def apply(): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableBillingMode(value: BillingMode | String): Self = StObject.set(x, "GlobalTableBillingMode", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableBillingModeUndefined: Self = StObject.set(x, "GlobalTableBillingMode", js.undefined)
    
    inline def setGlobalTableGlobalSecondaryIndexSettingsUpdate(value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
    
    inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    
    inline def setGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
    
    inline def setReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate]): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
    
    inline def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value*))
  }
}
