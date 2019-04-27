package typings
package delegatedDashEventsLib.delegatedDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fire(target: stdLib.EventTarget, name: java.lang.String): scala.Boolean = js.native
  def fire(target: stdLib.EventTarget, name: java.lang.String, detail: js.Any): scala.Boolean = js.native
  def off(
    name: java.lang.String,
    selector: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject
  ): scala.Unit = js.native
  def off(
    name: java.lang.String,
    selector: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def on(
    name: java.lang.String,
    selector: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject
  ): scala.Unit = js.native
  def on(
    name: java.lang.String,
    selector: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

