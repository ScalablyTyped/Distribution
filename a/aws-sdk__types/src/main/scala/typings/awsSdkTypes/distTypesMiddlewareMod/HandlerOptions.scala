package typings.awsSdkTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerOptions extends StObject {
  
  /**
    * A unique name to refer to a middleware
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A flag to override the existing middleware with the same name. Without
    * setting it, adding middleware with duplicated name will throw an exception.
    * @internal
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Handlers are ordered using a "step" that describes the stage of command
    * execution at which the handler will be executed. The available steps are:
    *
    * - initialize: The input is being prepared. Examples of typical
    *      initialization tasks include injecting default options computing
    *      derived parameters.
    * - serialize: The input is complete and ready to be serialized. Examples
    *      of typical serialization tasks include input validation and building
    *      an HTTP request from user input.
    * - build: The input has been serialized into an HTTP request, but that
    *      request may require further modification. Any request alterations
    *      will be applied to all retries. Examples of typical build tasks
    *      include injecting HTTP headers that describe a stable aspect of the
    *      request, such as `Content-Length` or a body checksum.
    * - finalizeRequest: The request is being prepared to be sent over the wire. The
    *      request in this stage should already be semantically complete and
    *      should therefore only be altered as match the recipient's
    *      expectations. Examples of typical finalization tasks include request
    *      signing and injecting hop-by-hop headers.
    * - deserialize: The response has arrived, the middleware here will deserialize
    *      the raw response object to structured response
    *
    *      Unlike initialization and build handlers, which are executed once
    *      per operation execution, finalization and deserialize handlers will be
    *      executed foreach HTTP request sent.
    *
    * @default 'initialize'
    */
  var step: js.UndefOr[Step] = js.undefined
  
  /**
    * A list of strings to any that identify the general purpose or important
    * characteristics of a given handler.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object HandlerOptions {
  
  inline def apply(): HandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerOptions]
  }
  
  extension [Self <: HandlerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
