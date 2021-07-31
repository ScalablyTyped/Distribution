package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayPeeringAttachmentsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The transit gateway peering attachments.
    */
  var TransitGatewayPeeringAttachments: js.UndefOr[TransitGatewayPeeringAttachmentList] = js.undefined
}
object DescribeTransitGatewayPeeringAttachmentsResult {
  
  @scala.inline
  def apply(): DescribeTransitGatewayPeeringAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayPeeringAttachmentsResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayPeeringAttachmentsResultMutableBuilder[Self <: DescribeTransitGatewayPeeringAttachmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayPeeringAttachments(value: TransitGatewayPeeringAttachmentList): Self = StObject.set(x, "TransitGatewayPeeringAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayPeeringAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachments", js.undefined)
    
    @scala.inline
    def setTransitGatewayPeeringAttachmentsVarargs(value: TransitGatewayPeeringAttachment*): Self = StObject.set(x, "TransitGatewayPeeringAttachments", js.Array(value :_*))
  }
}
