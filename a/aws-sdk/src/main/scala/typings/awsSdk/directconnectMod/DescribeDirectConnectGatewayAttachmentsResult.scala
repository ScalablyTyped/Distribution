package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewayAttachmentsResult extends StObject {
  
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
  implicit class DescribeDirectConnectGatewayAttachmentsResultMutableBuilder[Self <: DescribeDirectConnectGatewayAttachmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAttachments(value: DirectConnectGatewayAttachmentList): Self = StObject.set(x, "directConnectGatewayAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAttachmentsUndefined: Self = StObject.set(x, "directConnectGatewayAttachments", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayAttachmentsVarargs(value: DirectConnectGatewayAttachment*): Self = StObject.set(x, "directConnectGatewayAttachments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
