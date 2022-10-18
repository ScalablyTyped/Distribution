package typings.burns

import typings.burns.burnsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoriesConfigMod {
  
  @JSImport("burns/types/repositories/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param {string} key
    * @returns {null|Config|?}
    */
  inline def createBroadcaster(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBroadcaster")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @type {Config}
    */
  @JSImport("burns/types/repositories/config", "options")
  @js.native
  def options: Config = js.native
  inline def options_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /**
    *
    * @param {Config} options
    */
  inline def set(options: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    var broadcaster: js.UndefOr[String] = js.undefined
    
    var defaultHandler: js.UndefOr[js.Function1[/* payload */ Any, `false` | Unit]] = js.undefined
    
    var pusher: js.UndefOr[
        js.Object | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pusher.ClusterOptions */ Any)
      ] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
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
  
  type EventHandler = js.Function1[/* payload */ Any, `false` | Unit]
}
