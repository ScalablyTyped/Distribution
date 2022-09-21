package typings.createjsLib

import typings.createjsLib.anon.HandleEvent
import typings.createjsLib.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  trait Event extends StObject {
    
    // properties
    var bubbles: Boolean
    
    var cancelable: Boolean
    
    var currentTarget: Any
    
    // other event payloads
    var data: Any
    
    // It is 'Object' type officially, but 'any' is easier to use.
    var defaultPrevented: Boolean
    
    var delta: Double
    
    var error: String
    
    var eventPhase: Double
    
    var id: String
    
    var immediatePropagationStopped: Boolean
    
    var item: Any
    
    var loaded: Double
    
    var name: String
    
    var next: String
    
    var params: Any
    
    var paused: Boolean
    
    def preventDefault(): Unit
    
    var progress: Double
    
    var propagationStopped: Boolean
    
    var rawResult: Any
    
    def remove(): Unit
    
    var removed: Boolean
    
    var result: Any
    
    var runTime: Double
    
    def set(props: js.Object): Event
    
    var src: String
    
    def stopImmediatePropagation(): Unit
    
    def stopPropagation(): Unit
    
    var target: Any
    
    var time: Double
    
    // It is 'Object' type officially, but 'any' is easier to use.
    var timeStamp: Double
    
    var total: Double
    
    var `type`: String
  }
  object Event {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: Any,
      data: Any,
      defaultPrevented: Boolean,
      delta: Double,
      error: String,
      eventPhase: Double,
      id: String,
      immediatePropagationStopped: Boolean,
      item: Any,
      loaded: Double,
      name: String,
      next: String,
      params: Any,
      paused: Boolean,
      preventDefault: () => Unit,
      progress: Double,
      propagationStopped: Boolean,
      rawResult: Any,
      remove: () => Unit,
      removed: Boolean,
      result: Any,
      runTime: Double,
      set: js.Object => Event,
      src: String,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: Any,
      time: Double,
      timeStamp: Double,
      total: Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], immediatePropagationStopped = immediatePropagationStopped.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), progress = progress.asInstanceOf[js.Any], propagationStopped = propagationStopped.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImmediatePropagationStopped(value: Boolean): Self = StObject.set(x, "immediatePropagationStopped", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setPropagationStopped(value: Boolean): Self = StObject.set(x, "propagationStopped", value.asInstanceOf[js.Any])
      
      inline def setRawResult(value: Any): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setRunTime(value: Double): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
      
      inline def setSet(value: js.Object => Event): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
      data: Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: Boolean,
      data: Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: Boolean,
      data: Unit,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: Unit,
      data: Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: Unit,
      data: Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: js.Object,
      once: Unit,
      data: Unit,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Boolean,
      data: Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Boolean,
      data: Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Boolean,
      data: Unit,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Unit,
      data: Any
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Unit,
      data: Any,
      useCapture: Boolean
    ): js.Function = js.native
    def on(
      `type`: String,
      listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
      scope: Unit,
      once: Unit,
      data: Unit,
      useCapture: Boolean
    ): js.Function = js.native
    def on(`type`: String, listener: HandleEvent): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: Any): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Boolean,
      data: Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Boolean,
      data: Unit,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Unit, data: Any): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Unit,
      data: Any,
      useCapture: Boolean
    ): js.Object = js.native
    def on(
      `type`: String,
      listener: HandleEvent,
      scope: js.Object,
      once: Unit,
      data: Unit,
      useCapture: Boolean
    ): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Any): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Any): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Any): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Unit, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Any): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Unit, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Any): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Any): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Any, useCapture: Boolean): js.Object = js.native
    def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = js.native
    
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
