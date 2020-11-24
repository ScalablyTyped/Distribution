package typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String = js.native
  
  /**
    * <p> The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The global secondary index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global secondary index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global secondary index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global secondary index is ready for use.</p> </li> </ul>
    */
  var IndexStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
  
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
  
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
}
object ReplicaGlobalSecondaryIndexSettingsDescription {
  
  @scala.inline
  def apply(IndexName: String): ReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
  }
  
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexSettingsDescriptionOps[Self <: ReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
    
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
    def setIndexStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = this.set("IndexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexStatus: Self = this.set("IndexStatus", js.undefined)
    
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedReadCapacityAutoScalingSettings: Self = this.set("ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setProvisionedReadCapacityUnits(value: Double): Self = this.set("ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedReadCapacityUnits: Self = this.set("ProvisionedReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityUnits(value: Double): Self = this.set("ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedWriteCapacityUnits: Self = this.set("ProvisionedWriteCapacityUnits", js.undefined)
  }
}
