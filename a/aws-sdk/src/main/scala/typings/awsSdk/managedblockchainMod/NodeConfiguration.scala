package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConfiguration extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: AvailabilityZoneString = js.native
  /**
    * The Amazon Managed Blockchain instance type for the node.
    */
  var InstanceType: InstanceTypeString = js.native
  /**
    * 
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.native
}

object NodeConfiguration {
  @scala.inline
  def apply(AvailabilityZone: AvailabilityZoneString, InstanceType: InstanceTypeString): NodeConfiguration = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfiguration]
  }
  @scala.inline
  implicit class NodeConfigurationOps[Self <: NodeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZoneString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = this.set("LogPublishingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingConfiguration: Self = this.set("LogPublishingConfiguration", js.undefined)
  }
  
}

