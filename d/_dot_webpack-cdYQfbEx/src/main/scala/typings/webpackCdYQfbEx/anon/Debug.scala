package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.error
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.info
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.log
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.none
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.verbose
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.warn
import typings.webpackCdYQfbEx.webpackOptionsDTsMod.FilterItemTypes
import typings.webpackCdYQfbEx.webpackOptionsDTsMod.FilterTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  /**
  		 * Enable debug logging for specific loggers
  		 */
  var debug: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  		 * Log level
  		 */
  var level: js.UndefOr[none | error | warn | info | log | verbose] = js.undefined
}
object Debug {
  
  inline def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setDebug(value: FilterTypes | Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "debug", js.Array(value*))
    
    inline def setLevel(value: none | error | warn | info | log | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
