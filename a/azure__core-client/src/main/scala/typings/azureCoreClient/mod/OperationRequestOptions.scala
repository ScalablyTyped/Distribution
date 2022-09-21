package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelineResponse
import typings.azureCoreRestPipeline.coreRestPipelineMod.TransferProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationRequestOptions extends StObject {
  
  /**
    * Set to true if the request is sent over HTTP instead of HTTPS
    */
  var allowInsecureConnection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User defined custom request headers that
    * will be applied before the request is sent.
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
  var shouldDeserialize: js.UndefOr[Boolean | (js.Function1[/* response */ PipelineResponse, Boolean])] = js.undefined
  
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
    
    inline def setAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "allowInsecureConnection", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureConnectionUndefined: Self = StObject.set(x, "allowInsecureConnection", js.undefined)
    
    inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setShouldDeserialize(value: Boolean | (js.Function1[/* response */ PipelineResponse, Boolean])): Self = StObject.set(x, "shouldDeserialize", value.asInstanceOf[js.Any])
    
    inline def setShouldDeserializeFunction1(value: /* response */ PipelineResponse => Boolean): Self = StObject.set(x, "shouldDeserialize", js.Any.fromFunction1(value))
    
    inline def setShouldDeserializeUndefined: Self = StObject.set(x, "shouldDeserialize", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
