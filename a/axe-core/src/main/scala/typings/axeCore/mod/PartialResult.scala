package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialResult extends StObject {
  
  var environmentData: js.UndefOr[EnvironmentData] = js.undefined
  
  var frames: js.Array[SerialDqElement]
  
  var results: js.Array[PartialRuleResult]
}
object PartialResult {
  
  inline def apply(frames: js.Array[SerialDqElement], results: js.Array[PartialRuleResult]): PartialResult = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialResult] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentData(value: EnvironmentData): Self = StObject.set(x, "environmentData", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDataUndefined: Self = StObject.set(x, "environmentData", js.undefined)
    
    inline def setFrames(value: js.Array[SerialDqElement]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: SerialDqElement*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setResults(value: js.Array[PartialRuleResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: PartialRuleResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
