package typings.contentfulManagement.anon

import typings.contentfulManagement.appDefinitionMod.LocationDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/app-definition.AppDefinitionProps, 'sys'> */
@js.native
trait OmitAppDefinitionPropssys extends StObject {
  
  var locations: js.Array[LocationDefinition] = js.native
  
  var name: String = js.native
  
  var src: String = js.native
}
object OmitAppDefinitionPropssys {
  
  @scala.inline
  def apply(locations: js.Array[LocationDefinition], name: String, src: String): OmitAppDefinitionPropssys = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAppDefinitionPropssys]
  }
  
  @scala.inline
  implicit class OmitAppDefinitionPropssysMutableBuilder[Self <: OmitAppDefinitionPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[LocationDefinition]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: LocationDefinition*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
