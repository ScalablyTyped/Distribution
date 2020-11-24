package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericResourceFilter extends js.Object {
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * The tag name.
    */
  var tagname: js.UndefOr[String] = js.native
  
  /**
    * The tag value.
    */
  var tagvalue: js.UndefOr[String] = js.native
}
object GenericResourceFilter {
  
  @scala.inline
  def apply(): GenericResourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericResourceFilter]
  }
  
  @scala.inline
  implicit class GenericResourceFilterOps[Self <: GenericResourceFilter] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setTagname(value: String): Self = this.set("tagname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagname: Self = this.set("tagname", js.undefined)
    
    @scala.inline
    def setTagvalue(value: String): Self = this.set("tagvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagvalue: Self = this.set("tagvalue", js.undefined)
  }
}
