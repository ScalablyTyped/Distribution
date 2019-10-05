package typings.delegatedDashEvents.delegatedDashEventsMod

import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", "on")
@js.native
object on extends js.Object {
  def apply(name: String, selector: String, handler: EventListenerOrEventListenerObject): Unit = js.native
  def apply(
    name: String,
    selector: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

