package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: java.lang.String) = this()
  def this(`type`: js.Object) = this()
  var aborted: scala.Boolean = js.native
  var cancelled: scala.Boolean = js.native
  var currentTarget: js.Object = js.native
  var result: js.Any = js.native
  var target: js.Object = js.native
  var timeStamp: scala.Double = js.native
  var `type`: java.lang.String = js.native
}

