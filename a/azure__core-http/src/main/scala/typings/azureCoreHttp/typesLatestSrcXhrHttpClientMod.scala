package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcXhrHttpClientMod {
  
  @JSImport("@azure/core-http/types/latest/src/xhrHttpClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/xhrHttpClient", "XhrHttpClient")
  @js.native
  open class XhrHttpClient ()
    extends StObject
       with RequestPolicy {
    
    /**
      * A method that retrieves an {@link HttpOperationResponse} given a {@link WebResourceLike} describing the request to be made.
      * @param httpRequest - {@link WebResourceLike} describing the request to be made.
      */
    /* CompleteClass */
    override def sendRequest(httpRequest: WebResourceLike): js.Promise[HttpOperationResponse] = js.native
  }
  
  inline def parseHeaders(xhr: XMLHttpRequest): HttpHeadersLike = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaders")(xhr.asInstanceOf[js.Any]).asInstanceOf[HttpHeadersLike]
}
