package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionLoaRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
  
  /**
    * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
}
object DescribeConnectionLoaRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeConnectionLoaRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionLoaRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectionLoaRequestMutableBuilder[Self <: DescribeConnectionLoaRequest] (val x: Self) extends AnyVal {
    
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
