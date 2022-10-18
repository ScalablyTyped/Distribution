package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/core-rest-pipeline/types/3.1/core-rest-pipeline", "RestError")
@js.native
open class RestError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, options: RestErrorOptions) = this()
  
  /**
    * The code of the error itself (use statics on RestError if possible.)
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Bonus property set by the throw site.
    */
  var details: js.UndefOr[Any] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The request that was made.
    */
  var request: js.UndefOr[PipelineRequest] = js.native
  
  /**
    * The response received (if any.)
    */
  var response: js.UndefOr[PipelineResponse] = js.native
  
  /**
    * The HTTP status code of the request (if applicable.)
    */
  var statusCode: js.UndefOr[Double] = js.native
}
/* static members */
object RestError {
  
  /**
    * This means that parsing the response from the server failed.
    * It may have been malformed.
    */
  @JSImport("@azure/core-rest-pipeline/types/3.1/core-rest-pipeline", "RestError.PARSE_ERROR")
  @js.native
  val PARSE_ERROR: String = js.native
  
  /**
    * Something went wrong when making the request.
    * This means the actual request failed for some reason,
    * such as a DNS issue or the connection being lost.
    */
  @JSImport("@azure/core-rest-pipeline/types/3.1/core-rest-pipeline", "RestError.REQUEST_SEND_ERROR")
  @js.native
  val REQUEST_SEND_ERROR: String = js.native
}
