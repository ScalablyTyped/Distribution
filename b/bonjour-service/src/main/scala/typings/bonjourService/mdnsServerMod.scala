package typings.bonjourService

import typings.bonjourService.serviceMod.ServiceRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdnsServerMod {
  
  @JSImport("bonjour-service/dist/lib/mdns-server", JSImport.Default)
  @js.native
  open class default protected () extends Server {
    def this(opts: Any) = this()
    def this(opts: Any, errorCallback: js.Function) = this()
  }
  
  @JSImport("bonjour-service/dist/lib/mdns-server", "Server")
  @js.native
  open class Server protected () extends StObject {
    def this(opts: Any) = this()
    def this(opts: Any, errorCallback: js.Function) = this()
    
    /* private */ var errorCallback: Any = js.native
    
    /* private */ var isDuplicateRecord: Any = js.native
    
    var mdns: Any = js.native
    
    /* private */ var recordsFor: Any = js.native
    
    def register(records: js.Array[ServiceRecord]): Unit = js.native
    def register(records: ServiceRecord): Unit = js.native
    
    /* private */ var registry: Any = js.native
    
    /* private */ var respondToQuery: Any = js.native
    
    /* private */ var unique: Any = js.native
    
    def unregister(records: js.Array[ServiceRecord]): Unit = js.native
    def unregister(records: ServiceRecord): Unit = js.native
  }
}
