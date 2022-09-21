package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.abortSignalMod.AbortSignalLike
import typings.azureCoreHttp.httpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.webResourceMod.RequestOptionsBase
import typings.azureCoreHttp.webResourceMod.TransferProgressEvent
import typings.azureCoreTracing.mod.OperationTracingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionsMod {
  
  @JSImport("@azure/core-http/types/latest/src/operationOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def operationOptionsToRequestOptionsBase[T /* <: OperationOptions */](opts: T): RequestOptionsBase = ^.asInstanceOf[js.Dynamic].applyDynamic("operationOptionsToRequestOptionsBase")(opts.asInstanceOf[js.Any]).asInstanceOf[RequestOptionsBase]
  
  trait OperationOptions extends StObject {
    
    /**
      * The signal which can be used to abort requests.
      */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    /**
      * Options used when creating and sending HTTP requests for this operation.
      */
    var requestOptions: js.UndefOr[OperationRequestOptions] = js.undefined
    
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
      
      inline def setRequestOptions(value: OperationRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
      
      inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    }
  }
  
  trait OperationRequestOptions extends StObject {
    
    /**
      * User defined custom request headers that will be applied before the request is sent.
      */
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Callback which fires upon download progress.
      */
    var onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * Callback which fires upon upload progress.
      */
    var onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * Whether or not the HttpOperationResponse should be deserialized. If this is undefined, then the
      * HttpOperationResponse should be deserialized.
      */
    var shouldDeserialize: js.UndefOr[Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])] = js.undefined
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object OperationRequestOptions {
    
    inline def apply(): OperationRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationRequestOptions]
    }
    
    extension [Self <: OperationRequestOptions](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setShouldDeserialize(value: Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])): Self = StObject.set(x, "shouldDeserialize", value.asInstanceOf[js.Any])
      
      inline def setShouldDeserializeFunction1(value: /* response */ HttpOperationResponse => Boolean): Self = StObject.set(x, "shouldDeserialize", js.Any.fromFunction1(value))
      
      inline def setShouldDeserializeUndefined: Self = StObject.set(x, "shouldDeserialize", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
