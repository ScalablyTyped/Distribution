package typings.bonjourService

import typings.bonjourService.distLibBrowserMod.BrowserConfig
import typings.bonjourService.distLibServiceMod.ServiceConfig
import typings.std.CallableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bonjour-service", JSImport.Default)
  @js.native
  open class default () extends Bonjour {
    def this(opts: ServiceConfig) = this()
    def this(opts: Unit, errorCallback: js.Function) = this()
    def this(opts: ServiceConfig, errorCallback: js.Function) = this()
  }
  
  @JSImport("bonjour-service", "Bonjour")
  @js.native
  open class Bonjour () extends StObject {
    def this(opts: ServiceConfig) = this()
    def this(opts: Unit, errorCallback: js.Function) = this()
    def this(opts: ServiceConfig, errorCallback: js.Function) = this()
    
    def destroy(): Unit = js.native
    
    def find(): typings.bonjourService.distLibBrowserMod.default = js.native
    def find(
      opts: Unit,
      onup: js.Function1[/* service */ typings.bonjourService.distLibServiceMod.default, Unit]
    ): typings.bonjourService.distLibBrowserMod.default = js.native
    def find(opts: BrowserConfig): typings.bonjourService.distLibBrowserMod.default = js.native
    def find(
      opts: BrowserConfig,
      onup: js.Function1[/* service */ typings.bonjourService.distLibServiceMod.default, Unit]
    ): typings.bonjourService.distLibBrowserMod.default = js.native
    
    def findOne(): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: Unit, timeout: Double): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: Unit, timeout: Double, callback: CallableFunction): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: Unit, timeout: Unit, callback: CallableFunction): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: BrowserConfig): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: BrowserConfig, timeout: Double): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: BrowserConfig, timeout: Double, callback: CallableFunction): typings.bonjourService.distLibBrowserMod.default = js.native
    def findOne(opts: BrowserConfig, timeout: Unit, callback: CallableFunction): typings.bonjourService.distLibBrowserMod.default = js.native
    
    def publish(opts: ServiceConfig): typings.bonjourService.distLibServiceMod.default = js.native
    
    /* private */ var registry: Any = js.native
    
    /* private */ var server: Any = js.native
    
    def unpublishAll(): Unit = js.native
    def unpublishAll(callback: CallableFunction): Unit = js.native
  }
  
  @JSImport("bonjour-service", "Browser")
  @js.native
  open class Browser protected ()
    extends typings.bonjourService.distLibBrowserMod.default {
    def this(mdns: Any, opts: Any) = this()
    def this(
      mdns: Any,
      opts: Any,
      onup: js.Function1[/* service */ typings.bonjourService.distLibServiceMod.default, Unit]
    ) = this()
  }
  
  @JSImport("bonjour-service", "Service")
  @js.native
  open class Service protected ()
    extends typings.bonjourService.distLibServiceMod.default {
    def this(config: ServiceConfig) = this()
  }
}
