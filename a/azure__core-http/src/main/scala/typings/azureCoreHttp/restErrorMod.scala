package typings.azureCoreHttp

import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.webResourceMod.WebResourceLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restErrorMod {
  
  @JSImport("@azure/core-http/types/latest/src/restError", "RestError")
  @js.native
  open class RestError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
    def this(message: String, code: String, statusCode: Double, request: WebResourceLike) = this()
    def this(message: String, code: String, statusCode: Unit, request: WebResourceLike) = this()
    def this(message: String, code: Unit, statusCode: Double, request: WebResourceLike) = this()
    def this(message: String, code: Unit, statusCode: Unit, request: WebResourceLike) = this()
    def this(message: String, code: String, statusCode: Double, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: String,
      statusCode: Double,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: String, statusCode: Unit, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: String,
      statusCode: Unit,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: Unit, statusCode: Double, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: Unit,
      statusCode: Double,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: Unit, statusCode: Unit, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: Unit,
      statusCode: Unit,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    
    /**
      * The error code, if any. Can be one of the static error code properties (REQUEST_SEND_ERROR / PARSE_ERROR) or can be a string code from an underlying system call (E_NOENT).
      */
    var code: js.UndefOr[String] = js.native
    
    /**
      * Any additional details. In the case of deserialization errors, can be the processed response.
      */
    var details: js.UndefOr[Any] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Outgoing request.
      */
    var request: js.UndefOr[WebResourceLike] = js.native
    
    /**
      * Incoming response.
      */
    var response: js.UndefOr[HttpOperationResponse] = js.native
    
    /**
      * The HTTP status code of the response, if one was returned.
      */
    var statusCode: js.UndefOr[Double] = js.native
  }
  /* static members */
  object RestError {
    
    /**
      * A constant string to identify errors that may arise from parsing an incoming HTTP response. Usually indicates a malformed HTTP body, such as an encoded JSON payload that is incomplete.
      */
    @JSImport("@azure/core-http/types/latest/src/restError", "RestError.PARSE_ERROR")
    @js.native
    val PARSE_ERROR: String = js.native
    
    /**
      * A constant string to identify errors that may arise when making an HTTP request that indicates an issue with the transport layer (e.g. the hostname of the URL cannot be resolved via DNS.)
      */
    @JSImport("@azure/core-http/types/latest/src/restError", "RestError.REQUEST_SEND_ERROR")
    @js.native
    val REQUEST_SEND_ERROR: String = js.native
  }
}
