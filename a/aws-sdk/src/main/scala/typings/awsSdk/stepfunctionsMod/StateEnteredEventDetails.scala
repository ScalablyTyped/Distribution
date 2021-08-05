package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateEnteredEventDetails extends StObject {
  
  /**
    * The string that contains the JSON input data for the state. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about the input for an execution history event.
    */
  var inputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
  
  /**
    * The name of the state.
    */
  var name: Name
}
object StateEnteredEventDetails {
  
  inline def apply(name: Name): StateEnteredEventDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateEnteredEventDetails]
  }
  
  extension [Self <: StateEnteredEventDetails](x: Self) {
    
    inline def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    inline def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
