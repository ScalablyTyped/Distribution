package typings.cypress

import typings.cypress.Cypress.cy
import typings.cypress.typesCyBluebirdMod.BluebirdStatic
import typings.eventemitter2.mod.EventAndListener
import typings.eventemitter2.mod.GeneralEventEmitter
import typings.eventemitter2.mod.Listener
import typings.eventemitter2.mod.ListenerFn
import typings.eventemitter2.mod.event
import typings.eventemitter2.mod.eventNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<cypress.EventEmitter2, 'waitFor'> */
trait CyEventEmitter extends StObject {
  
  def addListener(event: event, listener: ListenerFn): this.type | Listener
  @JSName("addListener")
  var addListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener]
  
  @JSName("constructor")
  var constructor_Original: js.Function0[Any]
  
  var defaultMaxListeners: js.UndefOr[Any] = js.undefined
  
  def emit(event: event, values: Any*): Boolean
  
  def emitAsync(event: event, values: Any*): js.Promise[js.Array[Any]]
  @JSName("emitAsync")
  var emitAsync_Original: js.Function2[/* event */ event, /* repeated */ Any, js.Promise[js.Array[Any]]]
  
  def emitMap(eventName: String, args: js.Array[Any]): js.Array[js.Function1[/* repeated */ Any, Any]]
  
  def emitThen(eventName: String, args: js.Array[Any]): BluebirdStatic
  
  @JSName("emit")
  var emit_Original: js.Function2[/* event */ event, /* repeated */ Any, Boolean]
  
  def eventNames(): js.Array[event | eventNS]
  @JSName("eventNames")
  var eventNames_Original: js.Function0[js.Array[event | eventNS]]
  
  def getMaxListeners(): Double
  @JSName("getMaxListeners")
  var getMaxListeners_Original: js.Function0[Double]
  
  def hasListeners(): Boolean
  @JSName("hasListeners")
  var hasListeners_Original: js.Function0[Boolean]
  
  def listenTo(target: GeneralEventEmitter, events: event): this.type
  @JSName("listenTo")
  var listenTo_Original: js.Function2[/* target */ GeneralEventEmitter, /* events */ event, this.type]
  
  def listenerCount(): Double
  @JSName("listenerCount")
  var listenerCount_Original: js.Function0[Double]
  
  def listeners(): js.Array[ListenerFn]
  
  def listenersAny(): js.Array[ListenerFn]
  @JSName("listenersAny")
  var listenersAny_Original: js.Function0[js.Array[ListenerFn]]
  
  @JSName("listeners")
  var listeners_Original: js.Function0[js.Array[ListenerFn]]
  
  def many(event: event, timesToListen: Double, listener: ListenerFn): this.type | Listener
  @JSName("many")
  var many_Original: js.Function3[
    /* event */ event, 
    /* timesToListen */ Double, 
    /* listener */ ListenerFn, 
    this.type | Listener
  ]
  
  def off(event: event, listener: ListenerFn): this.type
  
  def offAny(listener: ListenerFn): this.type
  @JSName("offAny")
  var offAny_Original: js.Function1[/* listener */ ListenerFn, this.type]
  
  @JSName("off")
  var off_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type]
  
  def on(event: event, listener: ListenerFn): this.type | Listener
  
  def onAny(listener: EventAndListener): this.type
  @JSName("onAny")
  var onAny_Original: js.Function1[/* listener */ EventAndListener, this.type]
  
  @JSName("on")
  var on_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener]
  
  def once(event: event, listener: ListenerFn): this.type | Listener
  @JSName("once")
  var once_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener]
  
  def prependAny(listener: EventAndListener): this.type
  @JSName("prependAny")
  var prependAny_Original: js.Function1[/* listener */ EventAndListener, this.type]
  
  def prependListener(event: event, listener: ListenerFn): this.type | Listener
  @JSName("prependListener")
  var prependListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener]
  
  def prependMany(event: event, timesToListen: Double, listener: ListenerFn): this.type | Listener
  @JSName("prependMany")
  var prependMany_Original: js.Function3[
    /* event */ event, 
    /* timesToListen */ Double, 
    /* listener */ ListenerFn, 
    this.type | Listener
  ]
  
  def prependOnceListener(event: event, listener: ListenerFn): this.type | Listener
  @JSName("prependOnceListener")
  var prependOnceListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener]
  
  def proxyTo(cy: cy): Null
  
  def removeAllListeners(): this.type
  @JSName("removeAllListeners")
  var removeAllListeners_Original: js.Function0[this.type]
  
  def removeListener(event: event, listener: ListenerFn): this.type
  @JSName("removeListener")
  var removeListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type]
  
  def setMaxListeners(n: Double): Unit
  @JSName("setMaxListeners")
  var setMaxListeners_Original: js.Function1[/* n */ Double, Unit]
  
  def stopListeningTo(): Boolean
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function0[Boolean]
}
object CyEventEmitter {
  
  inline def apply(
    addListener: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    constructor: () => Any,
    emit: (/* event */ event, /* repeated */ Any) => Boolean,
    emitAsync: (/* event */ event, /* repeated */ Any) => js.Promise[js.Array[Any]],
    emitMap: (String, js.Array[Any]) => js.Array[js.Function1[/* repeated */ Any, Any]],
    emitThen: (String, js.Array[Any]) => BluebirdStatic,
    eventNames: () => js.Array[event | eventNS],
    getMaxListeners: () => Double,
    hasListeners: () => Boolean,
    listenTo: (/* target */ GeneralEventEmitter, /* events */ event) => CyEventEmitter,
    listenerCount: () => Double,
    listeners: () => js.Array[ListenerFn],
    listenersAny: () => js.Array[ListenerFn],
    many: (/* event */ event, /* timesToListen */ Double, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    off: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter,
    offAny: /* listener */ ListenerFn => CyEventEmitter,
    on: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    onAny: /* listener */ EventAndListener => CyEventEmitter,
    once: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    prependAny: /* listener */ EventAndListener => CyEventEmitter,
    prependListener: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    prependMany: (/* event */ event, /* timesToListen */ Double, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    prependOnceListener: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener,
    proxyTo: cy => Null,
    removeAllListeners: () => CyEventEmitter,
    removeListener: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter,
    setMaxListeners: /* n */ Double => Unit,
    stopListeningTo: () => Boolean
  ): CyEventEmitter = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), constructor = js.Any.fromFunction0(constructor), emit = js.Any.fromFunction2(emit), emitAsync = js.Any.fromFunction2(emitAsync), emitMap = js.Any.fromFunction2(emitMap), emitThen = js.Any.fromFunction2(emitThen), eventNames = js.Any.fromFunction0(eventNames), getMaxListeners = js.Any.fromFunction0(getMaxListeners), hasListeners = js.Any.fromFunction0(hasListeners), listenTo = js.Any.fromFunction2(listenTo), listenerCount = js.Any.fromFunction0(listenerCount), listeners = js.Any.fromFunction0(listeners), listenersAny = js.Any.fromFunction0(listenersAny), many = js.Any.fromFunction3(many), off = js.Any.fromFunction2(off), offAny = js.Any.fromFunction1(offAny), on = js.Any.fromFunction2(on), onAny = js.Any.fromFunction1(onAny), once = js.Any.fromFunction2(once), prependAny = js.Any.fromFunction1(prependAny), prependListener = js.Any.fromFunction2(prependListener), prependMany = js.Any.fromFunction3(prependMany), prependOnceListener = js.Any.fromFunction2(prependOnceListener), proxyTo = js.Any.fromFunction1(proxyTo), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), setMaxListeners = js.Any.fromFunction1(setMaxListeners), stopListeningTo = js.Any.fromFunction0(stopListeningTo))
    __obj.asInstanceOf[CyEventEmitter]
  }
  
  extension [Self <: CyEventEmitter](x: Self) {
    
    inline def setAddListener(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
    
    inline def setDefaultMaxListeners(value: Any): Self = StObject.set(x, "defaultMaxListeners", value.asInstanceOf[js.Any])
    
    inline def setDefaultMaxListenersUndefined: Self = StObject.set(x, "defaultMaxListeners", js.undefined)
    
    inline def setEmit(value: (/* event */ event, /* repeated */ Any) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setEmitAsync(value: (/* event */ event, /* repeated */ Any) => js.Promise[js.Array[Any]]): Self = StObject.set(x, "emitAsync", js.Any.fromFunction2(value))
    
    inline def setEmitMap(value: (String, js.Array[Any]) => js.Array[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "emitMap", js.Any.fromFunction2(value))
    
    inline def setEmitThen(value: (String, js.Array[Any]) => BluebirdStatic): Self = StObject.set(x, "emitThen", js.Any.fromFunction2(value))
    
    inline def setEventNames(value: () => js.Array[event | eventNS]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
    
    inline def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
    
    inline def setHasListeners(value: () => Boolean): Self = StObject.set(x, "hasListeners", js.Any.fromFunction0(value))
    
    inline def setListenTo(value: (/* target */ GeneralEventEmitter, /* events */ event) => CyEventEmitter): Self = StObject.set(x, "listenTo", js.Any.fromFunction2(value))
    
    inline def setListenerCount(value: () => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction0(value))
    
    inline def setListeners(value: () => js.Array[ListenerFn]): Self = StObject.set(x, "listeners", js.Any.fromFunction0(value))
    
    inline def setListenersAny(value: () => js.Array[ListenerFn]): Self = StObject.set(x, "listenersAny", js.Any.fromFunction0(value))
    
    inline def setMany(
      value: (/* event */ event, /* timesToListen */ Double, /* listener */ ListenerFn) => CyEventEmitter | Listener
    ): Self = StObject.set(x, "many", js.Any.fromFunction3(value))
    
    inline def setOff(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOffAny(value: /* listener */ ListenerFn => CyEventEmitter): Self = StObject.set(x, "offAny", js.Any.fromFunction1(value))
    
    inline def setOn(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnAny(value: /* listener */ EventAndListener => CyEventEmitter): Self = StObject.set(x, "onAny", js.Any.fromFunction1(value))
    
    inline def setOnce(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setPrependAny(value: /* listener */ EventAndListener => CyEventEmitter): Self = StObject.set(x, "prependAny", js.Any.fromFunction1(value))
    
    inline def setPrependListener(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
    
    inline def setPrependMany(
      value: (/* event */ event, /* timesToListen */ Double, /* listener */ ListenerFn) => CyEventEmitter | Listener
    ): Self = StObject.set(x, "prependMany", js.Any.fromFunction3(value))
    
    inline def setPrependOnceListener(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter | Listener): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
    
    inline def setProxyTo(value: cy => Null): Self = StObject.set(x, "proxyTo", js.Any.fromFunction1(value))
    
    inline def setRemoveAllListeners(value: () => CyEventEmitter): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
    
    inline def setRemoveListener(value: (/* event */ event, /* listener */ ListenerFn) => CyEventEmitter): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setSetMaxListeners(value: /* n */ Double => Unit): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
    
    inline def setStopListeningTo(value: () => Boolean): Self = StObject.set(x, "stopListeningTo", js.Any.fromFunction0(value))
  }
}
