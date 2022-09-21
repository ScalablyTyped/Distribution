package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterUnsupportedEssentialProperties extends StObject {
  
  var filterUnsupportedEssentialProperties: js.UndefOr[Boolean] = js.undefined
  
  var useMediaCapabilitiesApi: js.UndefOr[Boolean] = js.undefined
}
object FilterUnsupportedEssentialProperties {
  
  inline def apply(): FilterUnsupportedEssentialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterUnsupportedEssentialProperties]
  }
  
  extension [Self <: FilterUnsupportedEssentialProperties](x: Self) {
    
    inline def setFilterUnsupportedEssentialProperties(value: Boolean): Self = StObject.set(x, "filterUnsupportedEssentialProperties", value.asInstanceOf[js.Any])
    
    inline def setFilterUnsupportedEssentialPropertiesUndefined: Self = StObject.set(x, "filterUnsupportedEssentialProperties", js.undefined)
    
    inline def setUseMediaCapabilitiesApi(value: Boolean): Self = StObject.set(x, "useMediaCapabilitiesApi", value.asInstanceOf[js.Any])
    
    inline def setUseMediaCapabilitiesApiUndefined: Self = StObject.set(x, "useMediaCapabilitiesApi", js.undefined)
  }
}
