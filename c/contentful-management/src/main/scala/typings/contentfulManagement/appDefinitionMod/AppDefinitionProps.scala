package typings.contentfulManagement.appDefinitionMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppDefinitionProps extends js.Object {
  
  /**
    * Locations where the app can be installed
    */
  var locations: js.Array[LocationDefinition] = js.native
  
  /**
    * App name
    */
  var name: String = js.native
  
  /**
    * URL where the root HTML document of the app can be found
    */
  var src: String = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
}
object AppDefinitionProps {
  
  @scala.inline
  def apply(locations: js.Array[LocationDefinition], name: String, src: String, sys: MetaSysProps): AppDefinitionProps = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDefinitionProps]
  }
  
  @scala.inline
  implicit class AppDefinitionPropsOps[Self <: AppDefinitionProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
