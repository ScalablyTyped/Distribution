package typings.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementGroupRecursiveChildInfo extends js.Object {
  
  var childId: js.UndefOr[String] = js.native
  
  var childType: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var tenantId: js.UndefOr[String] = js.native
}
object ManagementGroupRecursiveChildInfo {
  
  @scala.inline
  def apply(): ManagementGroupRecursiveChildInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
  }
  
  @scala.inline
  implicit class ManagementGroupRecursiveChildInfoOps[Self <: ManagementGroupRecursiveChildInfo] (val x: Self) extends AnyVal {
    
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
    def setChildId(value: String): Self = this.set("childId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildId: Self = this.set("childId", js.undefined)
    
    @scala.inline
    def setChildType(value: String): Self = this.set("childType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildType: Self = this.set("childType", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
  }
}
