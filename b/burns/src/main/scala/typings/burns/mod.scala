package typings.burns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.burns.anon.BroadcastIf
import typings.burns.anon.Exclude
import typings.burns.burnsBooleans.`false`
import typings.burns.typesRepositoriesConfigMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("burns", JSImport.Namespace)
  @js.native
  val ^ : Burns = js.native
  
  /**
    * @typedef {import("./repositories/config").Config} Burns.Config
    * @typedef {import("./repositories/events").EventHandler} Burns.EventHandler
    * @typedef {import("./repositories/events").EventConfig} Burns.EventConfig
    */
  @js.native
  trait Burns extends StObject {
    
    /**
      * @param {Burns.Config} config
      * @returns {Burns}
      */
    def configure(): Burns = js.native
    def configure(hasDefaultHandlerBroadcasterPusher: Config): Burns = js.native
    
    /**
      * Dispatch an event, and broadcast it, if configured.
      * @param {string} eventName
      * @param {?} eventData
      * @param {Object<string, ?>} options
      * @param {string=} options.exclude
      * @returns {Burns}
      */
    def dispatch(eventName: String): Burns = js.native
    def dispatch(eventName: String, eventData: Any): Burns = js.native
    def dispatch(eventName: String, eventData: Any, hasExclude: Exclude): Burns = js.native
    def dispatch(eventName: String, eventData: Unit, hasExclude: Exclude): Burns = js.native
    
    /**
      *
      * @param {Object<string, Burns.EventHandler|Burns.EventHandler[]|Burns.EventConfig>} newEvents
      * @returns {Burns}
      */
    @JSName("registerEvents")
    def registerEvents_false(
      newEvents: StringDictionary[
          (js.Function1[/* payload */ Any, `false` | Unit]) | (js.Array[js.Function1[/* payload */ Any, `false` | Unit]]) | BroadcastIf
        ]
    ): Burns = js.native
  }
  object Burns {
    
    trait Config extends StObject {
      
      var broadcaster: js.UndefOr[String] = js.undefined
      
      var defaultHandler: js.UndefOr[js.Function1[/* payload */ Any, `false` | Unit]] = js.undefined
      
      var pusher: js.UndefOr[
            js.Object | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pusher.ClusterOptions */ Any)
          ] = js.undefined
    }
    object Config {
      
      inline def apply(): typings.burns.mod.Burns.Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.burns.mod.Burns.Config]
      }
      
      extension [Self <: typings.burns.mod.Burns.Config](x: Self) {
        
        inline def setBroadcaster(value: String): Self = StObject.set(x, "broadcaster", value.asInstanceOf[js.Any])
        
        inline def setBroadcasterUndefined: Self = StObject.set(x, "broadcaster", js.undefined)
        
        inline def setDefaultHandler(value: /* payload */ Any => `false` | Unit): Self = StObject.set(x, "defaultHandler", js.Any.fromFunction1(value))
        
        inline def setDefaultHandlerUndefined: Self = StObject.set(x, "defaultHandler", js.undefined)
        
        inline def setPusher(
          value: js.Object | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pusher.ClusterOptions */ Any)
        ): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
        
        inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
      }
    }
    
    trait EventConfig extends StObject {
      
      var broadcastIf: js.UndefOr[Boolean | (js.Function1[/* payload */ Any, Boolean])] = js.undefined
      
      var broadcastOn: js.UndefOr[String | (js.Function1[/* payload */ Any, String])] = js.undefined
      
      var handlers: js.Array[js.Function1[/* payload */ Any, `false` | Unit]]
    }
    object EventConfig {
      
      inline def apply(handlers: js.Array[js.Function1[/* payload */ Any, `false` | Unit]]): EventConfig = {
        val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventConfig]
      }
      
      extension [Self <: EventConfig](x: Self) {
        
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
    
    type EventHandler = js.Function1[/* payload */ Any, `false` | Unit]
  }
  
  type _To = Burns
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Burns = ^
}
