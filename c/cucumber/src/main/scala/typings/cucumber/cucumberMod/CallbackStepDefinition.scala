package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackStepDefinition extends js.Object {
  def apply(): Unit = js.native
  def apply(error: js.Any): Unit = js.native
  def apply(error: js.Any, pending: String): Unit = js.native
  def pending(): js.Thenable[_] = js.native
}

