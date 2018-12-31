package typings
package createjsDashLibLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.EventDispatcher")
@js.native
class EventDispatcher () extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEventEventObj): js.Object = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent, useCapture: scala.Boolean): js.Object = js.native
  // methods
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): js.Function = js.native
  def dispatchEvent(eventObj: Event): scala.Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): scala.Boolean = js.native
  def hasEventListener(`type`: java.lang.String): scala.Boolean = js.native
  def off(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def on(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent): js.Object = js.native
  def on(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEventEventObj): js.Object = js.native
  def on(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEventEventObj, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def on(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
   // It is necessary for "arguments.callee"
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Function = js.native
  def removeAllEventListeners(): scala.Unit = js.native
  def removeAllEventListeners(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: createjsDashLibLib.Anon_HandleEventEventObj,
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: createjsDashLibLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def willTrigger(`type`: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("createjs.EventDispatcher")
@js.native
object EventDispatcher extends js.Object {
  def initialize(target: js.Object): scala.Unit = js.native
}

