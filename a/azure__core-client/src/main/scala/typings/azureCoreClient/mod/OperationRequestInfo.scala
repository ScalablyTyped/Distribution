package typings.azureCoreClient.mod

import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelineResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationRequestInfo extends StObject {
  
  /**
    * Used to encode the request.
    */
  var operationArguments: js.UndefOr[OperationArguments] = js.undefined
  
  /**
    * A function that returns the proper OperationResponseMap for the given OperationSpec and
    * PipelineResponse combination. If this is undefined, then a simple status code lookup will
    * be used.
    */
  var operationResponseGetter: js.UndefOr[
    js.Function2[
      /* operationSpec */ OperationSpec, 
      /* response */ PipelineResponse, 
      js.UndefOr[OperationResponseMap]
    ]
  ] = js.undefined
  
  /**
    * Used to parse the response.
    */
  var operationSpec: js.UndefOr[OperationSpec] = js.undefined
  
  /**
    * Whether or not the PipelineResponse should be deserialized. Defaults to true.
    */
  var shouldDeserialize: js.UndefOr[Boolean | (js.Function1[/* response */ PipelineResponse, Boolean])] = js.undefined
}
object OperationRequestInfo {
  
  inline def apply(): OperationRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationRequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationRequestInfo] (val x: Self) extends AnyVal {
    
    inline def setOperationArguments(value: OperationArguments): Self = StObject.set(x, "operationArguments", value.asInstanceOf[js.Any])
    
    inline def setOperationArgumentsUndefined: Self = StObject.set(x, "operationArguments", js.undefined)
    
    inline def setOperationResponseGetter(
      value: (/* operationSpec */ OperationSpec, /* response */ PipelineResponse) => js.UndefOr[OperationResponseMap]
    ): Self = StObject.set(x, "operationResponseGetter", js.Any.fromFunction2(value))
    
    inline def setOperationResponseGetterUndefined: Self = StObject.set(x, "operationResponseGetter", js.undefined)
    
    inline def setOperationSpec(value: OperationSpec): Self = StObject.set(x, "operationSpec", value.asInstanceOf[js.Any])
    
    inline def setOperationSpecUndefined: Self = StObject.set(x, "operationSpec", js.undefined)
    
    inline def setShouldDeserialize(value: Boolean | (js.Function1[/* response */ PipelineResponse, Boolean])): Self = StObject.set(x, "shouldDeserialize", value.asInstanceOf[js.Any])
    
    inline def setShouldDeserializeFunction1(value: /* response */ PipelineResponse => Boolean): Self = StObject.set(x, "shouldDeserialize", js.Any.fromFunction1(value))
    
    inline def setShouldDeserializeUndefined: Self = StObject.set(x, "shouldDeserialize", js.undefined)
  }
}
