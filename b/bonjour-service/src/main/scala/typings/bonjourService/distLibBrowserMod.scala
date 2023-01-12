package typings.bonjourService

import typings.bonjourService.bonjourServiceStrings.tcp
import typings.bonjourService.bonjourServiceStrings.udp
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBrowserMod {
  
  @JSImport("bonjour-service/dist/lib/browser", JSImport.Default)
  @js.native
  open class default protected () extends Browser {
    def this(mdns: Any, opts: Any) = this()
    def this(
      mdns: Any,
      opts: Any,
      onup: js.Function1[/* service */ typings.bonjourService.distLibServiceMod.default, Unit]
    ) = this()
  }
  
  @JSImport("bonjour-service/dist/lib/browser", "Browser")
  @js.native
  open class Browser protected () extends EventEmitter {
    def this(mdns: Any, opts: Any) = this()
    def this(
      mdns: Any,
      opts: Any,
      onup: js.Function1[/* service */ typings.bonjourService.distLibServiceMod.default, Unit]
    ) = this()
    
    /* private */ var _services: Any = js.native
    
    /* private */ var addService: Any = js.native
    
    /* private */ var buildServicesFor: Any = js.native
    
    /* private */ var goodbyes: Any = js.native
    
    /* private */ var mdns: Any = js.native
    
    /* private */ var name: Any = js.native
    
    /* private */ var onresponse: Any = js.native
    
    /* private */ var removeService: Any = js.native
    
    /* private */ var serviceMap: Any = js.native
    
    def services: js.Array[Any] = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var txt: Any = js.native
    
    /* private */ var txtQuery: Any = js.native
    
    def update(): Unit = js.native
    
    /* private */ var wildcard: Any = js.native
  }
  
  trait BrowserConfig extends StObject {
    
    var protocol: js.UndefOr[tcp | udp] = js.undefined
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var txt: js.UndefOr[Any] = js.undefined
    
    var `type`: String
  }
  object BrowserConfig {
    
    inline def apply(`type`: String): BrowserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserConfig] (val x: Self) extends AnyVal {
      
      inline def setProtocol(value: tcp | udp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value*))
      
      inline def setTxt(value: Any): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
      
      inline def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
