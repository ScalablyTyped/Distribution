package typings.ckeditor.CKEDITOR.dom

import typings.ckeditor.AnonRemoveListener
import typings.ckeditor.CKEDITOR.eventInfo
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.event")
@js.native
class event protected () extends js.Object {
  def this(domEvent: Event_) = this()
  def getKey(): Double = js.native
  def getKeystroke(): Double = js.native
  def getPhase(): Double = js.native
  def getPhaseOffset(): position = js.native
  def getTarget(): node = js.native
  def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): AnonRemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any
  ): AnonRemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any,
    listenerData: js.Any
  ): AnonRemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any,
    listenerData: js.Any,
    priority: Double
  ): AnonRemoveListener = js.native
  def preventDefault(): Unit = js.native
  def preventDefault(stopPropagation: Boolean): Unit = js.native
  def stopPropagation(): Unit = js.native
}

