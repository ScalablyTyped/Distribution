package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
  /**
    * The attachments.
    */
  var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.native
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeDirectConnectGatewayAttachmentsResult {
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsResult]
  }
  @scala.inline
  implicit class DescribeDirectConnectGatewayAttachmentsResultOps[Self <: DescribeDirectConnectGatewayAttachmentsResult] (val x: Self) extends AnyVal {
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
    def setDirectConnectGatewayAttachmentsVarargs(value: DirectConnectGatewayAttachment*): Self = this.set("directConnectGatewayAttachments", js.Array(value :_*))
    @scala.inline
    def setDirectConnectGatewayAttachments(value: DirectConnectGatewayAttachmentList): Self = this.set("directConnectGatewayAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayAttachments: Self = this.set("directConnectGatewayAttachments", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

