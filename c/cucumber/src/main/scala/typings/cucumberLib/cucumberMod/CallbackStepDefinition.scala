package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackStepDefinition extends js.Object {
  def apply(): scala.Unit = js.native
  def apply(error: js.Any): scala.Unit = js.native
  def apply(error: js.Any, pending: java.lang.String): scala.Unit = js.native
  def pending(): js.Thenable[_] = js.native
}

