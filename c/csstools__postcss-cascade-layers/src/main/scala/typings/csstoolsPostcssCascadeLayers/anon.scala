package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.optionsMod.pluginOptions
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Options extends StObject {
    
    var options: pluginOptions
    
    var result: Result
  }
  object Options {
    
    inline def apply(options: pluginOptions, result: Result): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: pluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
