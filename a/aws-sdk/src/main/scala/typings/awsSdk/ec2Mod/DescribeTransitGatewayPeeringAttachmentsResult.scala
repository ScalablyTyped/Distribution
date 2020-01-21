package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayPeeringAttachmentsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The transit gateway peering attachments.
    */
  var TransitGatewayPeeringAttachments: js.UndefOr[TransitGatewayPeeringAttachmentList] = js.native
}

object DescribeTransitGatewayPeeringAttachmentsResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    TransitGatewayPeeringAttachments: TransitGatewayPeeringAttachmentList = null
  ): DescribeTransitGatewayPeeringAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayPeeringAttachments != null) __obj.updateDynamic("TransitGatewayPeeringAttachments")(TransitGatewayPeeringAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayPeeringAttachmentsResult]
  }
}

