package typings.burns

import org.scalablytyped.runtime.StringDictionary
import typings.burns.anon.BroadcastIf
import typings.burns.anon.BroadcastOn
import typings.burns.burnsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoriesEventsMod {
  
  @JSImport("burns/types/repositories/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventHandlers_false(eventName: String, handlers: (js.Function1[/* payload */ Any, `false` | Unit])*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventHandlers")(scala.List(eventName.asInstanceOf[js.Any]).`++`(handlers.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def add_false(
    events: StringDictionary[
      (js.Function1[/* payload */ Any, `false` | Unit]) | (js.Array[js.Function1[/* payload */ Any, `false` | Unit]]) | BroadcastIf
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def broadcastConfig(event: String): BroadcastOn = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastConfig")(event.asInstanceOf[js.Any]).asInstanceOf[BroadcastOn]
  
  inline def handlers(event: String): js.Array[js.Function1[/* payload */ Any, `false` | Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handlers")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function1[/* payload */ Any, `false` | Unit]]]
  
  inline def updateEventConfig(eventName: String, config: BroadcastIf): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEventConfig")(eventName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BroadcastConfig_ extends StObject {
    
    var broadcastIf: js.UndefOr[Boolean | (js.Function1[/* payload */ Any, Boolean])] = js.undefined
    
    var broadcastOn: js.UndefOr[String | (js.Function1[/* payload */ Any, String])] = js.undefined
  }
  object BroadcastConfig_ {
    
    inline def apply(): BroadcastConfig_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastConfig_]
    }
    
    extension [Self <: BroadcastConfig_](x: Self) {
      
      inline def setBroadcastIf(value: Boolean | (js.Function1[/* payload */ Any, Boolean])): Self = StObject.set(x, "broadcastIf", value.asInstanceOf[js.Any])
      
      inline def setBroadcastIfFunction1(value: /* payload */ Any => Boolean): Self = StObject.set(x, "broadcastIf", js.Any.fromFunction1(value))
      
      inline def setBroadcastIfUndefined: Self = StObject.set(x, "broadcastIf", js.undefined)
      
      inline def setBroadcastOn(value: String | (js.Function1[/* payload */ Any, String])): Self = StObject.set(x, "broadcastOn", value.asInstanceOf[js.Any])
      
      inline def setBroadcastOnFunction1(value: /* payload */ Any => String): Self = StObject.set(x, "broadcastOn", js.Any.fromFunction1(value))
      
      inline def setBroadcastOnUndefined: Self = StObject.set(x, "broadcastOn", js.undefined)
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
