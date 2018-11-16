package typings
package cordovaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// cordova/argscheck module
@js.native
trait ArgsCheck extends js.Object {
  var enableChecks: scala.Boolean = js.native
  def checkArgs(argsSpec: java.lang.String, functionName: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  def checkArgs(argsSpec: java.lang.String, functionName: java.lang.String, args: js.Array[_], callee: js.Any): scala.Unit = js.native
  def getValue(): js.Any = js.native
  def getValue(value: js.Any): js.Any = js.native
  def getValue(value: js.Any, defaultValue: js.Any): js.Any = js.native
}

