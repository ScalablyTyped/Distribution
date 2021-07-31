package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoaRequest extends StObject {
  
  /**
    * The ID of a connection, LAG, or interconnect.
    */
  var connectionId: ConnectionId
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.undefined
  
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
}
object DescribeLoaRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeLoaRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoaRequest]
  }
  
  @scala.inline
  implicit class DescribeLoaRequestMutableBuilder[Self <: DescribeLoaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaContentType(value: LoaContentType): Self = StObject.set(x, "loaContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaContentTypeUndefined: Self = StObject.set(x, "loaContentType", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
  }
}
