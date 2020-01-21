package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGatewayInformationOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group that is used to monitor events in the gateway.
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsSdk.storagegatewayMod.CloudWatchLogGroupARN] = js.native
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  /**
    * A NetworkInterface array that contains descriptions of the gateway network interfaces.
    */
  var GatewayNetworkInterfaces: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayNetworkInterfaces] = js.native
  /**
    * A value that indicates the operating state of the gateway.
    */
  var GatewayState: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayState] = js.native
  /**
    * A value that indicates the time zone configured for the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayTimezone] = js.native
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayType] = js.native
  /**
    * The type of hypervisor environment used by the host.
    */
  var HostEnvironment: js.UndefOr[typings.awsSdk.storagegatewayMod.HostEnvironment] = js.native
  /**
    * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response.
    */
  var LastSoftwareUpdate: js.UndefOr[typings.awsSdk.storagegatewayMod.LastSoftwareUpdate] = js.native
  /**
    * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
    */
  var NextUpdateAvailabilityDate: js.UndefOr[typings.awsSdk.storagegatewayMod.NextUpdateAvailabilityDate] = js.native
  /**
    * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The configuration settings for the virtual private cloud (VPC) endpoint for your gateway. 
    */
  var VPCEndpoint: js.UndefOr[String] = js.native
}

object DescribeGatewayInformationOutput {
  @scala.inline
  def apply(
    CloudWatchLogGroupARN: CloudWatchLogGroupARN = null,
    Ec2InstanceId: Ec2InstanceId = null,
    Ec2InstanceRegion: Ec2InstanceRegion = null,
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    GatewayName: String = null,
    GatewayNetworkInterfaces: GatewayNetworkInterfaces = null,
    GatewayState: GatewayState = null,
    GatewayTimezone: GatewayTimezone = null,
    GatewayType: GatewayType = null,
    HostEnvironment: HostEnvironment = null,
    LastSoftwareUpdate: LastSoftwareUpdate = null,
    NextUpdateAvailabilityDate: NextUpdateAvailabilityDate = null,
    Tags: Tags = null,
    VPCEndpoint: String = null
  ): DescribeGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogGroupARN != null) __obj.updateDynamic("CloudWatchLogGroupARN")(CloudWatchLogGroupARN.asInstanceOf[js.Any])
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId.asInstanceOf[js.Any])
    if (Ec2InstanceRegion != null) __obj.updateDynamic("Ec2InstanceRegion")(Ec2InstanceRegion.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName.asInstanceOf[js.Any])
    if (GatewayNetworkInterfaces != null) __obj.updateDynamic("GatewayNetworkInterfaces")(GatewayNetworkInterfaces.asInstanceOf[js.Any])
    if (GatewayState != null) __obj.updateDynamic("GatewayState")(GatewayState.asInstanceOf[js.Any])
    if (GatewayTimezone != null) __obj.updateDynamic("GatewayTimezone")(GatewayTimezone.asInstanceOf[js.Any])
    if (GatewayType != null) __obj.updateDynamic("GatewayType")(GatewayType.asInstanceOf[js.Any])
    if (HostEnvironment != null) __obj.updateDynamic("HostEnvironment")(HostEnvironment.asInstanceOf[js.Any])
    if (LastSoftwareUpdate != null) __obj.updateDynamic("LastSoftwareUpdate")(LastSoftwareUpdate.asInstanceOf[js.Any])
    if (NextUpdateAvailabilityDate != null) __obj.updateDynamic("NextUpdateAvailabilityDate")(NextUpdateAvailabilityDate.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VPCEndpoint != null) __obj.updateDynamic("VPCEndpoint")(VPCEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayInformationOutput]
  }
}

