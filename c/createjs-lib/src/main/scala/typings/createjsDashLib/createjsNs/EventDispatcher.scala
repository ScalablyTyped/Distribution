package typings.createjsDashLib.createjsNs

import typings.createjsDashLib.Anon_EventObj
import typings.createjsDashLib.Anon_EventObjHandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.EventDispatcher")
@js.native
class EventDispatcher () extends js.Object {
  // methods
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  def addEventListener(`type`: String, listener: Anon_EventObj): js.Object = js.native
  def addEventListener(`type`: String, listener: Anon_EventObjHandleEvent): js.Object = js.native
  def addEventListener(`type`: String, listener: Anon_EventObjHandleEvent, useCapture: Boolean): js.Object = js.native
  def addEventListener(`type`: String, listener: Anon_EventObj, useCapture: Boolean): js.Object = js.native
  def dispatchEvent(eventObj: String): Boolean = js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  def hasEventListener(`type`: String): Boolean = js.native
  def off(`type`: String, listener: js.Function): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: Anon_EventObj): Unit = js.native
  def off(`type`: String, listener: Anon_EventObjHandleEvent): Unit = js.native
  def off(`type`: String, listener: Anon_EventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: Anon_EventObj, useCapture: Boolean): Unit = js.native
   // It is necessary for "arguments.callee"
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(`type`: String, listener: Anon_EventObj): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObjHandleEvent): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObjHandleEvent, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObjHandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObjHandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: Anon_EventObjHandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObj, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObj, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: Anon_EventObj, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: Anon_EventObj,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def removeAllEventListeners(): Unit = js.native
  def removeAllEventListeners(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: Anon_EventObj): Unit = js.native
  def removeEventListener(`type`: String, listener: Anon_EventObjHandleEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: Anon_EventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: Anon_EventObj, useCapture: Boolean): Unit = js.native
  def willTrigger(`type`: String): Boolean = js.native
}

/* static members */
@JSGlobal("createjs.EventDispatcher")
@js.native
object EventDispatcher extends js.Object {
  def initialize(target: js.Object): Unit = js.native
}

