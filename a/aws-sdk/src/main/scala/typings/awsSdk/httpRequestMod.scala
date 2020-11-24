package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.endpointMod.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/http_request", JSImport.Namespace)
@js.native
object httpRequestMod extends js.Object {
  
  @js.native
  class HttpRequest protected () extends js.Object {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: Endpoint, region: String) = this()
    
    /**
      * The request body payload.
      */
    var body: String = js.native
    
    /**
      * The endpoint for the request.
      */
    var endpoint: Endpoint = js.native
    
    /**
      * A map of header keys and their respective values.
      */
    var headers: StringDictionary[String] = js.native
    
    /**
      * The HTTP method of the request.
      */
    var method: String = js.native
    
    /**
      * The path portion of the URI, e.g., "/list/?start=5&num=10".
      */
    var path: String = js.native
    
    /**
      * The part of the path excluding the query string.
      */
    def pathname(): String = js.native
    
    /**
      * The query string portion of the path.
      */
    var search: String = js.native
  }
}
