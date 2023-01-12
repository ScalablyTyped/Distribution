package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxeResults
  extends StObject
     with EnvironmentData {
  
  var inapplicable: js.Array[Result]
  
  var incomplete: js.Array[Result]
  
  var passes: js.Array[Result]
  
  var toolOptions: RunOptions
  
  var violations: js.Array[Result]
}
object AxeResults {
  
  /**
    * Object for axe Results
    */
  @JSImport("axe-core", "AxeResults")
  @js.native
  val ^ : AxeResults = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxeResults] (val x: Self) extends AnyVal {
    
    inline def setInapplicable(value: js.Array[Result]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
    
    inline def setInapplicableVarargs(value: Result*): Self = StObject.set(x, "inapplicable", js.Array(value*))
    
    inline def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value*))
    
    inline def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    inline def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value*))
    
    inline def setToolOptions(value: RunOptions): Self = StObject.set(x, "toolOptions", value.asInstanceOf[js.Any])
    
    inline def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
    
    inline def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value*))
  }
}
