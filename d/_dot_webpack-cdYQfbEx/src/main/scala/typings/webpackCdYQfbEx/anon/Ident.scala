package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetLoader
import typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ident extends StObject {
  
  /**
  			 * Unique loader identifier
  			 */
  var ident: js.UndefOr[String] = js.undefined
  
  /**
  			 * Loader name
  			 */
  var loader: js.UndefOr[RuleSetLoader] = js.undefined
  
  /**
  			 * Loader options
  			 */
  var options: js.UndefOr[RuleSetQuery] = js.undefined
  
  /**
  			 * Loader query
  			 */
  var query: js.UndefOr[RuleSetQuery] = js.undefined
}
object Ident {
  
  inline def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  
  extension [Self <: Ident](x: Self) {
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    inline def setLoader(value: RuleSetLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setOptions(value: RuleSetQuery): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setQuery(value: RuleSetQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
