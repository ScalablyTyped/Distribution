package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaRoles extends js.Object {
  
  var allowedAttrs: js.UndefOr[js.Array[String]] = js.native
  
  var nameFromContent: js.UndefOr[Boolean] = js.native
  
  var requiredAttrs: js.UndefOr[js.Array[String]] = js.native
  
  var requiredContext: js.UndefOr[js.Array[String]] = js.native
  
  var requiredOwned: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: AriaRolesType | DpubRolesType = js.native
  
  var unsupported: js.UndefOr[Boolean] = js.native
}
object AriaRoles {
  
  @scala.inline
  def apply(`type`: AriaRolesType | DpubRolesType): AriaRoles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaRoles]
  }
  
  @scala.inline
  implicit class AriaRolesOps[Self <: AriaRoles] (val x: Self) extends AnyVal {
    
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
    def setType(value: AriaRolesType | DpubRolesType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAttrsVarargs(value: String*): Self = this.set("allowedAttrs", js.Array(value :_*))
    
    @scala.inline
    def setAllowedAttrs(value: js.Array[String]): Self = this.set("allowedAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAttrs: Self = this.set("allowedAttrs", js.undefined)
    
    @scala.inline
    def setNameFromContent(value: Boolean): Self = this.set("nameFromContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFromContent: Self = this.set("nameFromContent", js.undefined)
    
    @scala.inline
    def setRequiredAttrsVarargs(value: String*): Self = this.set("requiredAttrs", js.Array(value :_*))
    
    @scala.inline
    def setRequiredAttrs(value: js.Array[String]): Self = this.set("requiredAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredAttrs: Self = this.set("requiredAttrs", js.undefined)
    
    @scala.inline
    def setRequiredContextVarargs(value: String*): Self = this.set("requiredContext", js.Array(value :_*))
    
    @scala.inline
    def setRequiredContext(value: js.Array[String]): Self = this.set("requiredContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredContext: Self = this.set("requiredContext", js.undefined)
    
    @scala.inline
    def setRequiredOwnedVarargs(value: String*): Self = this.set("requiredOwned", js.Array(value :_*))
    
    @scala.inline
    def setRequiredOwned(value: js.Array[String]): Self = this.set("requiredOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredOwned: Self = this.set("requiredOwned", js.undefined)
    
    @scala.inline
    def setUnsupported(value: Boolean): Self = this.set("unsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsupported: Self = this.set("unsupported", js.undefined)
  }
}
