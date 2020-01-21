package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayInfo extends js.Object {
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  /**
    * The state of the gateway. Valid Values: DISABLED or ACTIVE
    */
  var GatewayOperationalState: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayOperationalState] = js.native
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayType] = js.native
}

object GatewayInfo {
  @scala.inline
  def apply(
    Ec2InstanceId: Ec2InstanceId = null,
    Ec2InstanceRegion: Ec2InstanceRegion = null,
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    GatewayName: String = null,
    GatewayOperationalState: GatewayOperationalState = null,
    GatewayType: GatewayType = null
  ): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId.asInstanceOf[js.Any])
    if (Ec2InstanceRegion != null) __obj.updateDynamic("Ec2InstanceRegion")(Ec2InstanceRegion.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName.asInstanceOf[js.Any])
    if (GatewayOperationalState != null) __obj.updateDynamic("GatewayOperationalState")(GatewayOperationalState.asInstanceOf[js.Any])
    if (GatewayType != null) __obj.updateDynamic("GatewayType")(GatewayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayInfo]
  }
}

