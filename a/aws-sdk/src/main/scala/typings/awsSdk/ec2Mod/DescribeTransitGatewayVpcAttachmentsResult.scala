package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayVpcAttachmentsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the VPC attachments.
    */
  var TransitGatewayVpcAttachments: js.UndefOr[TransitGatewayVpcAttachmentList] = js.undefined
}
object DescribeTransitGatewayVpcAttachmentsResult {
  
  inline def apply(): DescribeTransitGatewayVpcAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayVpcAttachmentsResult]
  }
  
  extension [Self <: DescribeTransitGatewayVpcAttachmentsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayVpcAttachments(value: TransitGatewayVpcAttachmentList): Self = StObject.set(x, "TransitGatewayVpcAttachments", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayVpcAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachments", js.undefined)
    
    inline def setTransitGatewayVpcAttachmentsVarargs(value: TransitGatewayVpcAttachment*): Self = StObject.set(x, "TransitGatewayVpcAttachments", js.Array(value*))
  }
}
