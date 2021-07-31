package typings.babelPluginSyntaxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ManipulateOptions extends StObject {
    
    def manipulateOptions(opts: js.Any, parserOpts: Plugins): Unit
  }
  object ManipulateOptions {
    
    @scala.inline
    def apply(manipulateOptions: (js.Any, Plugins) => Unit): ManipulateOptions = {
      val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
      __obj.asInstanceOf[ManipulateOptions]
    }
    
    @scala.inline
    implicit class ManipulateOptionsMutableBuilder[Self <: ManipulateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManipulateOptions(value: (js.Any, Plugins) => Unit): Self = StObject.set(x, "manipulateOptions", js.Any.fromFunction2(value))
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[String]
  }
  object Plugins {
    
    @scala.inline
    def apply(plugins: js.Array[String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
