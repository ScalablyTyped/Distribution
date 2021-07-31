package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayAttachmentsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayAttachmentList] = js.undefined
}
object DescribeTransitGatewayAttachmentsResult {
  
  @scala.inline
  def apply(): DescribeTransitGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsResult]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayAttachmentsResultMutableBuilder[Self <: DescribeTransitGatewayAttachmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachments(value: TransitGatewayAttachmentList): Self = StObject.set(x, "TransitGatewayAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayAttachments", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentsVarargs(value: TransitGatewayAttachment*): Self = StObject.set(x, "TransitGatewayAttachments", js.Array(value :_*))
  }
}
