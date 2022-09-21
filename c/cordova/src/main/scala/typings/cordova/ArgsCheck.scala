package typings.cordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// cordova/argscheck module
@js.native
trait ArgsCheck extends StObject {
  
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[Any]): Unit = js.native
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[Any], callee: Any): Unit = js.native
  
  var enableChecks: Boolean = js.native
  
  def getValue(): Any = js.native
  def getValue(value: Any): Any = js.native
  def getValue(value: Any, defaultValue: Any): Any = js.native
  def getValue(value: Unit, defaultValue: Any): Any = js.native
}
