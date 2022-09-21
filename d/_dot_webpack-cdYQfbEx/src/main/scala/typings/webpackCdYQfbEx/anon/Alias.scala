package typings.webpackCdYQfbEx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
  				 * New request
  				 */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
  				 * Request to be redirected
  				 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  				 * Redirect only exact matching request
  				 */
  var onlyModule: js.UndefOr[Boolean] = js.undefined
}
object Alias {
  
  inline def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  extension [Self <: Alias](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
    
    inline def setOnlyModuleUndefined: Self = StObject.set(x, "onlyModule", js.undefined)
  }
}
