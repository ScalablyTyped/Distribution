package typings.cordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// cordova/argscheck module
@js.native
trait ArgsCheck extends StObject {
  
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[js.Any]): Unit = js.native
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[js.Any], callee: js.Any): Unit = js.native
  
  var enableChecks: Boolean = js.native
  
  def getValue(): js.Any = js.native
  def getValue(value: js.Any): js.Any = js.native
  def getValue(value: js.Any, defaultValue: js.Any): js.Any = js.native
  def getValue(value: Unit, defaultValue: js.Any): js.Any = js.native
}
