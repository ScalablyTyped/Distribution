package typings.cucumber.mod

import typings.cucumber.mod.pickle.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookScenarioResult extends StObject {
  
  var pickle: Pickle
  
  var result: ScenarioResult
  
  var sourceLocation: SourceLocation
}
object HookScenarioResult {
  
  inline def apply(pickle: Pickle, result: ScenarioResult, sourceLocation: SourceLocation): HookScenarioResult = {
    val __obj = js.Dynamic.literal(pickle = pickle.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookScenarioResult]
  }
  
  extension [Self <: HookScenarioResult](x: Self) {
    
    inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ScenarioResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSourceLocation(value: SourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
  }
}
