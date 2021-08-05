package typings.contentfulManagement.anon

import typings.contentfulManagement.appDefinitionMod.LocationDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/app-definition.AppDefinitionProps, 'sys'> */
trait OmitAppDefinitionPropssys extends StObject {
  
  var locations: js.Array[LocationDefinition]
  
  var name: String
  
  var src: String
}
object OmitAppDefinitionPropssys {
  
  inline def apply(locations: js.Array[LocationDefinition], name: String, src: String): OmitAppDefinitionPropssys = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAppDefinitionPropssys]
  }
  
  extension [Self <: OmitAppDefinitionPropssys](x: Self) {
    
    inline def setLocations(value: js.Array[LocationDefinition]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: LocationDefinition*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
