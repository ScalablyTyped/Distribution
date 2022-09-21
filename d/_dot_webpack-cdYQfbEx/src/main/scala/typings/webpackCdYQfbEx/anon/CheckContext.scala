package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.ignorePluginDTsMod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckContext
  extends StObject
     with IgnorePluginOptions {
  
  /**
  			 * A filter function for context
  			 */
  var checkContext: js.UndefOr[js.Function1[/* context */ String, Boolean]] = js.undefined
  
  /**
  			 * A filter function for resource and context
  			 */
  var checkResource: js.UndefOr[js.Function2[/* resource */ String, /* context */ String, Boolean]] = js.undefined
}
object CheckContext {
  
  inline def apply(): CheckContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckContext]
  }
  
  extension [Self <: CheckContext](x: Self) {
    
    inline def setCheckContext(value: /* context */ String => Boolean): Self = StObject.set(x, "checkContext", js.Any.fromFunction1(value))
    
    inline def setCheckContextUndefined: Self = StObject.set(x, "checkContext", js.undefined)
    
    inline def setCheckResource(value: (/* resource */ String, /* context */ String) => Boolean): Self = StObject.set(x, "checkResource", js.Any.fromFunction2(value))
    
    inline def setCheckResourceUndefined: Self = StObject.set(x, "checkResource", js.undefined)
  }
}
