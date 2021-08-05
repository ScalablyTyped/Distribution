package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSpeechSynthesisTaskOutput extends StObject {
  
  /**
    * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
    */
  var SynthesisTask: js.UndefOr[typings.awsSdk.pollyMod.SynthesisTask] = js.undefined
}
object StartSpeechSynthesisTaskOutput {
  
  inline def apply(): StartSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
  }
  
  extension [Self <: StartSpeechSynthesisTaskOutput](x: Self) {
    
    inline def setSynthesisTask(value: SynthesisTask): Self = StObject.set(x, "SynthesisTask", value.asInstanceOf[js.Any])
    
    inline def setSynthesisTaskUndefined: Self = StObject.set(x, "SynthesisTask", js.undefined)
  }
}
