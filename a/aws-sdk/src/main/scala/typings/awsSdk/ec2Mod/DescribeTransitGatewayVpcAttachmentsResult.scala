package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTransitGatewayVpcAttachmentsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the VPC attachments.
    */
  var TransitGatewayVpcAttachments: js.UndefOr[TransitGatewayVpcAttachmentList] = js.native
}
object DescribeTransitGatewayVpcAttachmentsResult {
  
  @scala.inline
  def apply(): DescribeTransitGatewayVpcAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayVpcAttachmentsResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayVpcAttachmentsResultMutableBuilder[Self <: DescribeTransitGatewayVpcAttachmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayVpcAttachments(value: TransitGatewayVpcAttachmentList): Self = StObject.set(x, "TransitGatewayVpcAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayVpcAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachments", js.undefined)
    
    @scala.inline
    def setTransitGatewayVpcAttachmentsVarargs(value: TransitGatewayVpcAttachment*): Self = StObject.set(x, "TransitGatewayVpcAttachments", js.Array(value :_*))
  }
}
