package typings.babelWebpackPlugin

import typings.babelCore.mod.TransformOptions
import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  type BabelWebpackPlugin = Plugin
  
  type Matcher = RegExp | String | (js.Array[RegExp | String])
  
  trait Options
    extends StObject
       with TransformOptions {
    
    var exclude: js.UndefOr[Matcher] = js.undefined
    
    var include: js.UndefOr[Matcher] = js.undefined
    
    var test: js.UndefOr[Matcher] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: Matcher): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (RegExp | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: Matcher): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (RegExp | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setTest(value: Matcher): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: (RegExp | String)*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
