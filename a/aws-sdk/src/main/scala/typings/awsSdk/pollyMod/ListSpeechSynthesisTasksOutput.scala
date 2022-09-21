package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpeechSynthesisTasksOutput extends StObject {
  
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.undefined
  
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typings.awsSdk.pollyMod.SynthesisTasks] = js.undefined
}
object ListSpeechSynthesisTasksOutput {
  
  inline def apply(): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
  
  extension [Self <: ListSpeechSynthesisTasksOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSynthesisTasks(value: SynthesisTasks): Self = StObject.set(x, "SynthesisTasks", value.asInstanceOf[js.Any])
    
    inline def setSynthesisTasksUndefined: Self = StObject.set(x, "SynthesisTasks", js.undefined)
    
    inline def setSynthesisTasksVarargs(value: SynthesisTask*): Self = StObject.set(x, "SynthesisTasks", js.Array(value*))
  }
}
