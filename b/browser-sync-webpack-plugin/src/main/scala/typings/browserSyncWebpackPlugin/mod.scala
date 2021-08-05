package typings.browserSyncWebpackPlugin

import typings.browserSync.mod.BrowserSyncInstance
import typings.std.Error
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-sync-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Plugin {
    def this(browserSyncOptions: typings.browserSync.mod.Options) = this()
    def this(browserSyncOptions: typings.browserSync.mod.Options, pluginOptions: Options) = this()
  }
  
  type BrowserSyncPlugin = Plugin
  
  trait Options extends StObject {
    
    /**
      * BrowserSync instance init callback.
      * @defaultValue undefined
      */
    var callback: js.UndefOr[js.Function2[/* error */ Error, /* bs */ BrowserSyncInstance, Unit]] = js.undefined
    
    /**
      * allows BrowserSync to inject changes inplace instead of reloading the page when changed
      * chunks are all CSS files.
      * @defaultValue false
      */
    var injectCss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * BrowserSync instance name.
      * @defaultValue 'bs-webpack-plugin'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Should BrowserSync handle reloads?
      * @defaultValue true
      */
    var reload: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: (/* error */ Error, /* bs */ BrowserSyncInstance) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setInjectCss(value: Boolean): Self = StObject.set(x, "injectCss", value.asInstanceOf[js.Any])
      
      inline def setInjectCssUndefined: Self = StObject.set(x, "injectCss", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    }
  }
}
