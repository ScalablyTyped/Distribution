package typings.contentfulManagement.anon

import typings.contentfulManagement.appDefinitionMod.LocationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/app-definition.AppDefinitionProps, 'sys'> */
@js.native
trait OmitAppDefinitionPropssys extends js.Object {
  
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
  implicit class OmitAppDefinitionPropssysOps[Self <: OmitAppDefinitionPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: LocationDefinition*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[LocationDefinition]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
