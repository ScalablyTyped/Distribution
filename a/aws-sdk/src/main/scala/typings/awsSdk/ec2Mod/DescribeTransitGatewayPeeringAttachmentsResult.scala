package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeTransitGatewayPeeringAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayPeeringAttachmentsResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayPeeringAttachmentsResultOps[Self <: DescribeTransitGatewayPeeringAttachmentsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayPeeringAttachmentsVarargs(value: TransitGatewayPeeringAttachment*): Self = this.set("TransitGatewayPeeringAttachments", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayPeeringAttachments(value: TransitGatewayPeeringAttachmentList): Self = this.set("TransitGatewayPeeringAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayPeeringAttachments: Self = this.set("TransitGatewayPeeringAttachments", js.undefined)
  }
}
