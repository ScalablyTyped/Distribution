package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInterconnectLoaRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.undefined
  
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
}
object DescribeInterconnectLoaRequest {
  
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeInterconnectLoaRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInterconnectLoaRequest]
  }
  
  @scala.inline
  implicit class DescribeInterconnectLoaRequestMutableBuilder[Self <: DescribeInterconnectLoaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
    
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
