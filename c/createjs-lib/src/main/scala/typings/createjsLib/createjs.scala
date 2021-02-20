package typings.createjsLib

import typings.createjsLib.anon.HandleEvent
import typings.createjsLib.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait Event extends StObject {
    
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
    
    def preventDefault(): Unit = js.native
    
    var progress: Double = js.native
    
    var propagationStopped: Boolean = js.native
    
    var rawResult: js.Any = js.native
    
    def remove(): Unit = js.native
    
    var removed: Boolean = js.native
    
    var result: js.Any = js.native
    
    var runTime: Double = js.native
    
    def set(props: js.Object): Event = js.native
    
    var src: String = js.native
    
    def stopImmediatePropagation(): Unit = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: js.Any = js.native
    
    var time: Double = js.native
    
    // It is 'Object' type officially, but 'any' is easier to use.
    var timeStamp: Double = js.native
    
    var total: Double = js.native
    
    var `type`: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: js.Any,
      data: js.Any,
      defaultPrevented: Boolean,
      delta: Double,
      error: String,
      eventPhase: Double,
      id: String,
      immediatePropagationStopped: Boolean,
      item: js.Any,
      loaded: Double,
      name: String,
      next: String,
      params: js.Any,
      paused: Boolean,
      preventDefault: () => Unit,
      progress: Double,
      propagationStopped: Boolean,
      rawResult: js.Any,
      remove: () => Unit,
      removed: Boolean,
      result: js.Any,
      runTime: Double,
      set: js.Object => Event,
      src: String,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: js.Any,
      time: Double,
      timeStamp: Double,
      total: Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], immediatePropagationStopped = immediatePropagationStopped.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), progress = progress.asInstanceOf[js.Any], propagationStopped = propagationStopped.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediatePropagationStopped(value: Boolean): Self = StObject.set(x, "immediatePropagationStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagationStopped(value: Boolean): Self = StObject.set(x, "propagationStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawResult(value: js.Any): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunTime(value: Double): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Object => Event): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventDispatcher extends StObject {
    
    // methods
    def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
    def addEventListener(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      useCapture: Boolean
    ): js.Function = js.native
    def addEventListener(`type`: String, listener: HandleEvent): js.Object = js.native
    def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = js.native
    def addEventListener(`type`: String, listener: `0`): js.Object = js.native
    def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = js.native
    
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
    def off(`type`: String, listener: HandleEvent): Unit = js.native
    def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
    def off(`type`: String, listener: `0`): Unit = js.native
    def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
    
    // It is necessary for "arguments.callee"
    def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Function = js.native
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
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
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
    def on(`type`: String, listener: HandleEvent): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.Any
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.Any
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Boolean,
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Boolean,
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.UndefOr[scala.Nothing],
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean, data: js.Any): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.UndefOr[scala.Nothing],
      once: Boolean,
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: js.UndefOr[scala.Nothing], data: js.Any): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.Object,
      once: js.UndefOr[scala.Nothing],
      data: js.Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = js.native
    def on(
      `type`: String,
      listener: `0`,
      scope: js.Object,
      once: Boolean,
      data: js.UndefOr[scala.Nothing],
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = js.native
    
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
    def removeEventListener(`type`: String, listener: HandleEvent): Unit = js.native
    def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: `0`): Unit = js.native
    def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
    
    def willTrigger(`type`: String): Boolean = js.native
  }
}
