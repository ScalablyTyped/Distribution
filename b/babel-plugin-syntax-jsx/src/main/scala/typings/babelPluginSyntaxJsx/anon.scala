package typings.babelPluginSyntaxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ManipulateOptions extends StObject {
    
    def manipulateOptions(opts: Any, parserOpts: Plugins): Unit
  }
  object ManipulateOptions {
    
    inline def apply(manipulateOptions: (Any, Plugins) => Unit): ManipulateOptions = {
      val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
      __obj.asInstanceOf[ManipulateOptions]
    }
    
    extension [Self <: ManipulateOptions](x: Self) {
      
      inline def setManipulateOptions(value: (Any, Plugins) => Unit): Self = StObject.set(x, "manipulateOptions", js.Any.fromFunction2(value))
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[String]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[String]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
