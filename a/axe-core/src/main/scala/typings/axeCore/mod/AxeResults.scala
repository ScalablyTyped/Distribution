package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxeResults extends StObject {
  
  var inapplicable: js.Array[Result] = js.native
  
  var incomplete: js.Array[Result] = js.native
  
  var passes: js.Array[Result] = js.native
  
  var testEngine: TestEngine = js.native
  
  var testEnvironment: TestEnvironment = js.native
  
  var testRunner: TestRunner = js.native
  
  var timestamp: String = js.native
  
  var toolOptions: RunOptions = js.native
  
  var url: String = js.native
  
  var violations: js.Array[Result] = js.native
}
object AxeResults {
  
  /**
  	 * Object for axe Results
  	 */
  @JSImport("axe-core", "AxeResults")
  @js.native
  val ^ : AxeResults = js.native
  
  @scala.inline
  implicit class AxeResultsMutableBuilder[Self <: AxeResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInapplicable(value: js.Array[Result]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInapplicableVarargs(value: Result*): Self = StObject.set(x, "inapplicable", js.Array(value :_*))
    
    @scala.inline
    def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value :_*))
    
    @scala.inline
    def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value :_*))
    
    @scala.inline
    def setTestEngine(value: TestEngine): Self = StObject.set(x, "testEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunner(value: TestRunner): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolOptions(value: RunOptions): Self = StObject.set(x, "toolOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value :_*))
  }
}
