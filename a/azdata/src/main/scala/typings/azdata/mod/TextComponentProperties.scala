package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextComponentProperties
  extends ComponentProperties
     with TitledComponentProperties {
  
  var description: js.UndefOr[String] = js.native
  
  var links: js.UndefOr[js.Array[LinkArea]] = js.native
  
  var requiredIndicator: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TextComponentProperties {
  
  @scala.inline
  def apply(): TextComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextComponentProperties]
  }
  
  @scala.inline
  implicit class TextComponentPropertiesOps[Self <: TextComponentProperties] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkArea*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkArea]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setRequiredIndicator(value: Boolean): Self = this.set("requiredIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredIndicator: Self = this.set("requiredIndicator", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
