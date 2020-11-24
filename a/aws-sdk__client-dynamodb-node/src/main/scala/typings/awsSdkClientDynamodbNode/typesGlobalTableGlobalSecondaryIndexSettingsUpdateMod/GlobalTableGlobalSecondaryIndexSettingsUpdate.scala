package typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
  
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String = js.native
  
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
}
object GlobalTableGlobalSecondaryIndexSettingsUpdate {
  
  @scala.inline
  def apply(IndexName: String): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
  
  @scala.inline
  implicit class GlobalTableGlobalSecondaryIndexSettingsUpdateOps[Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexName(value: String): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = this.set("ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = this.set("ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityUnits(value: Double): Self = this.set("ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedWriteCapacityUnits: Self = this.set("ProvisionedWriteCapacityUnits", js.undefined)
  }
}
