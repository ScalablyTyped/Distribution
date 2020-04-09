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
  def apply(
    AvailabilityZone: AvailabilityZoneString,
    InstanceType: InstanceTypeString,
    LogPublishingConfiguration: NodeLogPublishingConfiguration = null
  ): NodeConfiguration = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    if (LogPublishingConfiguration != null) __obj.updateDynamic("LogPublishingConfiguration")(LogPublishingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfiguration]
  }
}

