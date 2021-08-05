package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardEmbedUrlResponse extends StObject {
  
  /**
    * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5 minutes. The API operation provides the URL with an auth_code value that enables one (and only one) sign-on to a user session that is valid for 10 hours. 
    */
  var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object GetDashboardEmbedUrlResponse {
  
  inline def apply(): GetDashboardEmbedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
  }
  
  extension [Self <: GetDashboardEmbedUrlResponse](x: Self) {
    
    inline def setEmbedUrl(value: EmbeddingUrl): Self = StObject.set(x, "EmbedUrl", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrlUndefined: Self = StObject.set(x, "EmbedUrl", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
