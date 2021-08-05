package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextComponentProperties
  extends StObject
     with ComponentProperties
     with TitledComponentProperties {
  
  var description: js.UndefOr[String] = js.undefined
  
  var links: js.UndefOr[js.Array[LinkArea]] = js.undefined
  
  var requiredIndicator: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TextComponentProperties {
  
  inline def apply(): TextComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextComponentProperties]
  }
  
  extension [Self <: TextComponentProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLinks(value: js.Array[LinkArea]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkArea*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setRequiredIndicator(value: Boolean): Self = StObject.set(x, "requiredIndicator", value.asInstanceOf[js.Any])
    
    inline def setRequiredIndicatorUndefined: Self = StObject.set(x, "requiredIndicator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
