package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupDetail extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: Date = js.native
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer = js.native
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType = js.native
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer = js.native
  /**
    * EC2 instance type.
    */
  var InstanceType: typings.awsSdk.emrMod.InstanceType = js.native
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: MarketType = js.native
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  /**
    * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState = js.native
}

object InstanceGroupDetail {
  @scala.inline
  def apply(
    CreationDateTime: Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState,
    BidPrice: XmlStringMaxLen256 = null,
    EndDateTime: Date = null,
    InstanceGroupId: XmlStringMaxLen256 = null,
    LastStateChangeReason: XmlString = null,
    Name: XmlStringMaxLen256 = null,
    ReadyDateTime: Date = null,
    StartDateTime: Date = null
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], InstanceRequestCount = InstanceRequestCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId.asInstanceOf[js.Any])
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupDetail]
  }
}

