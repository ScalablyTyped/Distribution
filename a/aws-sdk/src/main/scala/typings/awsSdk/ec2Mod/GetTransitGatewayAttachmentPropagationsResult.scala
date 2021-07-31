package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayAttachmentPropagationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the propagation route tables.
    */
  var TransitGatewayAttachmentPropagations: js.UndefOr[TransitGatewayAttachmentPropagationList] = js.undefined
}
object GetTransitGatewayAttachmentPropagationsResult {
  
  @scala.inline
  def apply(): GetTransitGatewayAttachmentPropagationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayAttachmentPropagationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayAttachmentPropagationsResultMutableBuilder[Self <: GetTransitGatewayAttachmentPropagationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentPropagations(value: TransitGatewayAttachmentPropagationList): Self = StObject.set(x, "TransitGatewayAttachmentPropagations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentPropagationsUndefined: Self = StObject.set(x, "TransitGatewayAttachmentPropagations", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentPropagationsVarargs(value: TransitGatewayAttachmentPropagation*): Self = StObject.set(x, "TransitGatewayAttachmentPropagations", js.Array(value :_*))
  }
}
