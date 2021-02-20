package typings.browserSyncWebpackPlugin

import typings.browserSync.mod.BrowserSyncInstance
import typings.std.Error
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-sync-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends Plugin {
    def this(browserSyncOptions: typings.browserSync.mod.Options) = this()
    def this(browserSyncOptions: typings.browserSync.mod.Options, pluginOptions: Options) = this()
  }
  
  type BrowserSyncPlugin = Plugin
  
  @js.native
  trait Options extends StObject {
    
    /**
      * BrowserSync instance init callback.
      * @defaultValue undefined
      */
    var callback: js.UndefOr[js.Function2[/* error */ Error, /* bs */ BrowserSyncInstance, Unit]] = js.native
    
    /**
      * allows BrowserSync to inject changes inplace instead of reloading the page when changed
      * chunks are all CSS files.
      * @defaultValue false
      */
    var injectCss: js.UndefOr[Boolean] = js.native
    
    /**
      * BrowserSync instance name.
      * @defaultValue 'bs-webpack-plugin'
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Should BrowserSync handle reloads?
      * @defaultValue true
      */
    var reload: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* error */ Error, /* bs */ BrowserSyncInstance) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setInjectCss(value: Boolean): Self = StObject.set(x, "injectCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectCssUndefined: Self = StObject.set(x, "injectCss", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    }
  }
}
