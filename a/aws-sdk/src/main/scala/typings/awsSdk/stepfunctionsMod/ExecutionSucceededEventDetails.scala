package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionSucceededEventDetails extends StObject {
  
  /**
    * The JSON data output by the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
}
object ExecutionSucceededEventDetails {
  
  inline def apply(): ExecutionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionSucceededEventDetails]
  }
  
  extension [Self <: ExecutionSucceededEventDetails](x: Self) {
    
    inline def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
