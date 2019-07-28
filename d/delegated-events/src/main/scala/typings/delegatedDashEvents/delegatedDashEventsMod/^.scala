package typings.delegatedDashEvents.delegatedDashEventsMod

import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fire(target: EventTarget, name: String): Boolean = js.native
  def fire(target: EventTarget, name: String, detail: js.Any): Boolean = js.native
  def off(name: String, selector: String, handler: EventListenerOrEventListenerObject): Unit = js.native
  def off(
    name: String,
    selector: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  def on(name: String, selector: String, handler: EventListenerOrEventListenerObject): Unit = js.native
  def on(
    name: String,
    selector: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

