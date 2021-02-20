package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpResponseMod {
  
  @JSImport("aws-sdk/lib/http_response", "HttpResponse")
  @js.native
  class HttpResponse () extends StObject {
    
    /**
      * The response body payload.
      */
    var body: String | Buffer | Uint8Array = js.native
    
    /**
      * Disables buffering on the HTTP response and returns the stream for reading.
      */
    def createUnbufferedStream(): Readable | XMLHttpRequest = js.native
    
    /**
      * A map of response header keys and their respective values.
      */
    var headers: StringDictionary[String] = js.native
    
    /**
      * The HTTP status code of the response (e.g., 200, 404).
      */
    var statusCode: Double = js.native
    
    /**
      * The HTTP status message of the response (e.g., 'Bad Request', 'Not Found')
      */
    var statusMessage: String = js.native
    
    /**
      * Whether this response is being streamed at a low-level.
      */
    var streaming: Boolean = js.native
  }
  
  @js.native
  trait XMLHttpRequest extends StObject
}
