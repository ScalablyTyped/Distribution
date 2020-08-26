package typings.ckeditor.CKEDITOR.dom

import typings.ckeditor.CKEDITOR.eventInfo
import typings.ckeditor.anon.RemoveListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait event extends js.Object {
  def getKey(): Double = js.native
  def getKeystroke(): Double = js.native
  def getPhase(): Double = js.native
  def getPhaseOffset(): position = js.native
  def getTarget(): node = js.native
  def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.UndefOr[scala.Nothing],
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.UndefOr[scala.Nothing],
    listenerData: js.Any
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.UndefOr[scala.Nothing],
    listenerData: js.Any,
    priority: Double
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any,
    listenerData: js.UndefOr[scala.Nothing],
    priority: Double
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any,
    listenerData: js.Any
  ): RemoveListener = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: js.Any,
    listenerData: js.Any,
    priority: Double
  ): RemoveListener = js.native
  def preventDefault(): Unit = js.native
  def preventDefault(stopPropagation: Boolean): Unit = js.native
  def stopPropagation(): Unit = js.native
}

