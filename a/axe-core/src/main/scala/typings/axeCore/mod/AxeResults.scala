package typings.axeCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxeResults extends js.Object {
  
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
/**
	 * Object for axe Results
	 */
@JSImport("axe-core", "AxeResults")
@js.native
object AxeResults extends TopLevel[AxeResults]
