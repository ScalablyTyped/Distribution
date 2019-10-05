package typings.createjsDashLib

import typings.createjsDashLib.createjs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs")
@js.native
object createjs extends js.Object {
  @js.native
  class Event protected () extends js.Object {
    def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
    // properties
    var bubbles: Boolean = js.native
    var cancelable: Boolean = js.native
    var currentTarget: js.Any = js.native
    // other event payloads
    var data: js.Any = js.native
     // It is 'Object' type officially, but 'any' is easier to use.
    var defaultPrevented: Boolean = js.native
    var delta: Double = js.native
    var error: String = js.native
    var eventPhase: Double = js.native
    var id: String = js.native
    var immediatePropagationStopped: Boolean = js.native
    var item: js.Any = js.native
    var loaded: Double = js.native
    var name: String = js.native
    var next: String = js.native
    var params: js.Any = js.native
    var paused: Boolean = js.native
    var progress: Double = js.native
    var propagationStopped: Boolean = js.native
    var rawResult: js.Any = js.native
    var removed: Boolean = js.native
    var result: js.Any = js.native
    var runTime: Double = js.native
    var src: String = js.native
    var target: js.Any = js.native
    var time: Double = js.native
     // It is 'Object' type officially, but 'any' is easier to use.
    var timeStamp: Double = js.native
    var total: Double = js.native
    var `type`: String = js.native
    def preventDefault(): Unit = js.native
    def remove(): Unit = js.native
    def set(props: js.Object): Event = js.native
    def stopImmediatePropagation(): Unit = js.native
    def stopPropagation(): Unit = js.native
  }
  
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
  
  def extend(subclass: js.Function0[_], superclass: js.Function0[_]): js.Function0[_] = js.native
  def indexOf(array: js.Array[_], searchElement: js.Object): Double = js.native
  def promote(subclass: js.Function0[_], prefix: String): js.Function0[_] = js.native
  def proxy(method: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  def proxy(method: Anon_EventObjHandleEvent, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  def proxy(method: Anon_EventObj, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  /* static members */
  @js.native
  object EventDispatcher extends js.Object {
    def initialize(target: js.Object): Unit = js.native
  }
  
}

