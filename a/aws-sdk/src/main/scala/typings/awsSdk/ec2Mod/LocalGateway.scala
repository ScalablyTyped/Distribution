package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGateway extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account ID that owns the local gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The state of the local gateway.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the local gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LocalGateway {
  @scala.inline
  def apply(
    LocalGatewayId: String = null,
    OutpostArn: String = null,
    OwnerId: String = null,
    State: String = null,
    Tags: TagList = null
  ): LocalGateway = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGateway]
  }
}

