package typings.bonjourService

import typings.bonjourService.distLibServiceMod.ServiceConfig
import typings.std.CallableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRegistryMod {
  
  @JSImport("bonjour-service/dist/lib/registry", JSImport.Default)
  @js.native
  open class default protected () extends Registry {
    def this(server: typings.bonjourService.distLibMdnsServerMod.default) = this()
  }
  
  @JSImport("bonjour-service/dist/lib/registry", "Registry")
  @js.native
  open class Registry protected () extends StObject {
    def this(server: typings.bonjourService.distLibMdnsServerMod.default) = this()
    
    /* private */ var announce: Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var probe: Any = js.native
    
    def publish(config: ServiceConfig): typings.bonjourService.distLibServiceMod.default = js.native
    
    /* private */ var server: Any = js.native
    
    /* private */ var services: Any = js.native
    
    /* private */ var teardown: Any = js.native
    
    def unpublishAll(): Unit = js.native
    def unpublishAll(callback: CallableFunction): Unit = js.native
  }
}
