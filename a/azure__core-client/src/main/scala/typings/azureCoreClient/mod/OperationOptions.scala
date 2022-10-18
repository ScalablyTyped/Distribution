package typings.azureCoreClient.mod

import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreTracing.mod.OperationTracingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationOptions extends StObject {
  
  /**
    * The signal which can be used to abort requests.
    */
  var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  
  /**
    * A function to be called each time a response is received from the server
    * while performing the requested operation.
    * May be called multiple times.
    */
  var onResponse: js.UndefOr[RawResponseCallback] = js.undefined
  
  /**
    * Options used when creating and sending HTTP requests for this operation.
    */
  var requestOptions: js.UndefOr[OperationRequestOptions] = js.undefined
  
  /**
    * Options to override serialization/de-serialization behavior.
    */
  var serializerOptions: js.UndefOr[SerializerOptions] = js.undefined
  
  /**
    * Options used when tracing is enabled.
    */
  var tracingOptions: js.UndefOr[OperationTracingOptions] = js.undefined
}
object OperationOptions {
  
  inline def apply(): OperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOptions]
  }
  
  extension [Self <: OperationOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setOnResponse(
      value: (/* rawResponse */ FullOperationResponse, /* flatResponse */ Any, /* error */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "onResponse", js.Any.fromFunction3(value))
    
    inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
    
    inline def setRequestOptions(value: OperationRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSerializerOptions(value: SerializerOptions): Self = StObject.set(x, "serializerOptions", value.asInstanceOf[js.Any])
    
    inline def setSerializerOptionsUndefined: Self = StObject.set(x, "serializerOptions", js.undefined)
    
    inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
    
    inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
  }
}
