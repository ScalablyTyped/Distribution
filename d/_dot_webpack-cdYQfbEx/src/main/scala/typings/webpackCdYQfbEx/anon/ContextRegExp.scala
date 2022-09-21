package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.ignorePluginDTsMod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRegExp
  extends StObject
     with IgnorePluginOptions {
  
  /**
  			 * A RegExp to test the context (directory) against
  			 */
  var contextRegExp: js.UndefOr[js.RegExp] = js.undefined
  
  /**
  			 * A RegExp to test the request against
  			 */
  var resourceRegExp: js.UndefOr[js.RegExp] = js.undefined
}
object ContextRegExp {
  
  inline def apply(): ContextRegExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRegExp]
  }
  
  extension [Self <: ContextRegExp](x: Self) {
    
    inline def setContextRegExp(value: js.RegExp): Self = StObject.set(x, "contextRegExp", value.asInstanceOf[js.Any])
    
    inline def setContextRegExpUndefined: Self = StObject.set(x, "contextRegExp", js.undefined)
    
    inline def setResourceRegExp(value: js.RegExp): Self = StObject.set(x, "resourceRegExp", value.asInstanceOf[js.Any])
    
    inline def setResourceRegExpUndefined: Self = StObject.set(x, "resourceRegExp", js.undefined)
  }
}
