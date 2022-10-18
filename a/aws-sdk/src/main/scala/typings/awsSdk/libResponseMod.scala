package typings.awsSdk

import typings.awsSdk.libHttpResponseMod.HttpResponse
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResponseMod {
  
  @JSImport("aws-sdk/lib/response", "Response")
  @js.native
  open class Response[D, E] () extends StObject {
    
    /**
    		 * The de-serialized response data from the service.
    		 * Can be null if an error occurred.
    		 */
    var data: D | Unit = js.native
    
    /**
    		 * A structure containing information about a service or networking error.
    		 */
    var error: E | Unit = js.native
    
    /**
    		 * Whether more pages of data can be returned by further requests.
    		 */
    def hasNextPage(): Boolean = js.native
    
    /**
    		 * The raw HTTP response object containing the response headers and body information from the server.
    		 */
    var httpResponse: HttpResponse = js.native
    
    /**
    		 * Creates a new request for the next page of response data, calling the callback with the page data if a callback is provided.
    		 */
    def nextPage(): (Request[D, E]) | Unit = js.native
    def nextPage(callback: js.Function2[/* err */ E, /* data */ D, Unit]): (Request[D, E]) | Unit = js.native
    
    /**
    		 * The number of redirects that were followed before the request was completed.
    		 */
    var redirectCount: Double = js.native
    
    /**
    		 * Returns the unique request ID associated with the response.
    		 * Log this value when debugging requests for AWS support.
    		 */
    var requestId: String = js.native
    
    /**
    		 * The number of retries that were attempted before the request was completed.
    		 */
    var retryCount: Double = js.native
  }
}
