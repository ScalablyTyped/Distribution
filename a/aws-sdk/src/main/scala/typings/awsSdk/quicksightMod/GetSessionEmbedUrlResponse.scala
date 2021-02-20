package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSessionEmbedUrlResponse extends StObject {
  
  /**
    * A single-use URL that you can put into your server-side web page to embed your QuickSight session. This URL is valid for 5 minutes. The API operation provides the URL with an auth_code value that enables one (and only one) sign-on to a user session that is valid for 10 hours. 
    */
  var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object GetSessionEmbedUrlResponse {
  
  @scala.inline
  def apply(): GetSessionEmbedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionEmbedUrlResponse]
  }
  
  @scala.inline
  implicit class GetSessionEmbedUrlResponseMutableBuilder[Self <: GetSessionEmbedUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedUrl(value: EmbeddingUrl): Self = StObject.set(x, "EmbedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUrlUndefined: Self = StObject.set(x, "EmbedUrl", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
