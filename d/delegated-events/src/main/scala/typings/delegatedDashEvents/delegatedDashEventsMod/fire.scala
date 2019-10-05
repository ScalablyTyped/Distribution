package typings.delegatedDashEvents.delegatedDashEventsMod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", "fire")
@js.native
object fire extends js.Object {
  def apply(target: EventTarget, name: String): Boolean = js.native
  def apply(target: EventTarget, name: String, detail: js.Any): Boolean = js.native
}

