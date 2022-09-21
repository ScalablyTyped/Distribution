package typings.burns

import org.scalablytyped.runtime.StringDictionary
import typings.burns.burnsBooleans.`false`
import typings.burns.configMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def createBroadcaster(driver: String, config: Any): Broadcast
  }
  object `0` {
    
    inline def apply(createBroadcaster: (String, Any) => Broadcast): `0` = {
      val __obj = js.Dynamic.literal(createBroadcaster = js.Any.fromFunction2(createBroadcaster))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setCreateBroadcaster(value: (String, Any) => Broadcast): Self = StObject.set(x, "createBroadcaster", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    /**
      * Broadcast an event.
      *
      * @param {string} event
      * @param {?} payload
      * @param {Object<string, ?>} options
      * @param {string=} options.exclude
      */
    def broadcast(event: String): js.Promise[Unit] = js.native
    def broadcast(event: String, payload: Any): js.Promise[Unit] = js.native
    def broadcast(event: String, payload: Any, options: Exclude): js.Promise[Unit] = js.native
    def broadcast(event: String, payload: Unit, options: Exclude): js.Promise[Unit] = js.native
  }
  
  trait Add extends StObject {
    
    @JSName("addEventHandlers")
    def addEventHandlers_false(eventName: String, handlers: (js.Function1[/* payload */ Any, `false` | Unit])*): Unit
    
    @JSName("add")
    def add_false(
      events: StringDictionary[
          (js.Function1[/* payload */ Any, `false` | Unit]) | (js.Array[js.Function1[/* payload */ Any, `false` | Unit]]) | BroadcastIf
        ]
    ): Unit
    
    def broadcastConfig(event: String): BroadcastOn
    
    def handlers(event: String): js.Array[js.Function1[/* payload */ Any, `false` | Unit]]
    
    def updateEventConfig(eventName: String, config: BroadcastIf): Unit
  }
  object Add {
    
    inline def apply(
      add: StringDictionary[
          (js.Function1[/* payload */ Any, `false` | Unit]) | (js.Array[js.Function1[/* payload */ Any, `false` | Unit]]) | BroadcastIf
        ] => Unit,
      addEventHandlers: (String, /* repeated */ js.Function1[/* payload */ Any, `false` | Unit]) => Unit,
      broadcastConfig: String => BroadcastOn,
      handlers: String => js.Array[js.Function1[/* payload */ Any, `false` | Unit]],
      updateEventConfig: (String, BroadcastIf) => Unit
    ): Add = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventHandlers = js.Any.fromFunction2(addEventHandlers), broadcastConfig = js.Any.fromFunction1(broadcastConfig), handlers = js.Any.fromFunction1(handlers), updateEventConfig = js.Any.fromFunction2(updateEventConfig))
      __obj.asInstanceOf[Add]
    }
    
    extension [Self <: Add](x: Self) {
      
      inline def setAdd(
        value: StringDictionary[
              (js.Function1[/* payload */ Any, `false` | Unit]) | (js.Array[js.Function1[/* payload */ Any, `false` | Unit]]) | BroadcastIf
            ] => Unit
      ): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddEventHandlers(value: (String, /* repeated */ js.Function1[/* payload */ Any, `false` | Unit]) => Unit): Self = StObject.set(x, "addEventHandlers", js.Any.fromFunction2(value))
      
      inline def setBroadcastConfig(value: String => BroadcastOn): Self = StObject.set(x, "broadcastConfig", js.Any.fromFunction1(value))
      
      inline def setHandlers(value: String => js.Array[js.Function1[/* payload */ Any, `false` | Unit]]): Self = StObject.set(x, "handlers", js.Any.fromFunction1(value))
      
      inline def setUpdateEventConfig(value: (String, BroadcastIf) => Unit): Self = StObject.set(x, "updateEventConfig", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Broadcast extends StObject {
    
    def broadcast(channels: String, eventName: String, eventData: Any, options: Exclude): Any = js.native
    def broadcast(channels: js.Array[String], eventName: String, eventData: Any, options: Exclude): Any = js.native
  }
  
  trait BroadcastIf extends StObject {
    
    var broadcastIf: js.UndefOr[Boolean | (js.Function1[/* payload */ Any, Boolean])] = js.undefined
    
    var broadcastOn: js.UndefOr[String | (js.Function1[/* payload */ Any, String])] = js.undefined
    
    var handlers: js.Array[js.Function1[/* payload */ Any, `false` | Unit]]
  }
  object BroadcastIf {
    
    inline def apply(handlers: js.Array[js.Function1[/* payload */ Any, `false` | Unit]]): BroadcastIf = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastIf]
    }
    
    extension [Self <: BroadcastIf](x: Self) {
      
      inline def setBroadcastIf(value: Boolean | (js.Function1[/* payload */ Any, Boolean])): Self = StObject.set(x, "broadcastIf", value.asInstanceOf[js.Any])
      
      inline def setBroadcastIfFunction1(value: /* payload */ Any => Boolean): Self = StObject.set(x, "broadcastIf", js.Any.fromFunction1(value))
      
      inline def setBroadcastIfUndefined: Self = StObject.set(x, "broadcastIf", js.undefined)
      
      inline def setBroadcastOn(value: String | (js.Function1[/* payload */ Any, String])): Self = StObject.set(x, "broadcastOn", value.asInstanceOf[js.Any])
      
      inline def setBroadcastOnFunction1(value: /* payload */ Any => String): Self = StObject.set(x, "broadcastOn", js.Any.fromFunction1(value))
      
      inline def setBroadcastOnUndefined: Self = StObject.set(x, "broadcastOn", js.undefined)
      
      inline def setHandlers(value: js.Array[js.Function1[/* payload */ Any, `false` | Unit]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: (js.Function1[/* payload */ Any, `false` | Unit])*): Self = StObject.set(x, "handlers", js.Array(value*))
    }
  }
  
  trait BroadcastOn extends StObject {
    
    var broadcastIf: js.UndefOr[Boolean | (js.Function1[/* payload */ Any, Boolean])] = js.undefined
    
    var broadcastOn: js.UndefOr[String | (js.Function1[/* payload */ Any, String])] = js.undefined
  }
  object BroadcastOn {
    
    inline def apply(): BroadcastOn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastOn]
    }
    
    extension [Self <: BroadcastOn](x: Self) {
      
      inline def setBroadcastIf(value: Boolean | (js.Function1[/* payload */ Any, Boolean])): Self = StObject.set(x, "broadcastIf", value.asInstanceOf[js.Any])
      
      inline def setBroadcastIfFunction1(value: /* payload */ Any => Boolean): Self = StObject.set(x, "broadcastIf", js.Any.fromFunction1(value))
      
      inline def setBroadcastIfUndefined: Self = StObject.set(x, "broadcastIf", js.undefined)
      
      inline def setBroadcastOn(value: String | (js.Function1[/* payload */ Any, String])): Self = StObject.set(x, "broadcastOn", value.asInstanceOf[js.Any])
      
      inline def setBroadcastOnFunction1(value: /* payload */ Any => String): Self = StObject.set(x, "broadcastOn", js.Any.fromFunction1(value))
      
      inline def setBroadcastOnUndefined: Self = StObject.set(x, "broadcastOn", js.undefined)
    }
  }
  
  trait CreateBroadcaster extends StObject {
    
    def createBroadcaster(key: String): Any
    
    var options: Config
    
    def set(options: Config): Unit
  }
  object CreateBroadcaster {
    
    inline def apply(createBroadcaster: String => Any, options: Config, set: Config => Unit): CreateBroadcaster = {
      val __obj = js.Dynamic.literal(createBroadcaster = js.Any.fromFunction1(createBroadcaster), options = options.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[CreateBroadcaster]
    }
    
    extension [Self <: CreateBroadcaster](x: Self) {
      
      inline def setCreateBroadcaster(value: String => Any): Self = StObject.set(x, "createBroadcaster", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Config): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Config => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DequeueHandlers extends StObject {
    
    /**
      * Cancel queued handlers so they are no longer called.
      * @param {string} eventName
      */
    def dequeueHandlers(eventName: String): Unit = js.native
    
    /**
      * Dispatch an event.
      *
      * @param {string} eventName
      * @param {?} payload
      */
    def dispatch(eventName: String): Unit = js.native
    def dispatch(eventName: String, payload: Any): Unit = js.native
    
    /**
      * Queue handlers to be called.
      * @param {string} eventName
      * @param {?} eventData
      */
    def queueHandlers(eventName: String): Unit = js.native
    def queueHandlers(eventName: String, eventData: Any): Unit = js.native
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[String] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
}
