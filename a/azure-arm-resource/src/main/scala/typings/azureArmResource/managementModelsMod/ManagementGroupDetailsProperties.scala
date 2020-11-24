package typings.azureArmResource.managementModelsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementGroupDetailsProperties extends js.Object {
  
  var managementGroupType: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[ParentGroupInfo] = js.native
  
  var updatedBy: js.UndefOr[String] = js.native
  
  var updatedTime: js.UndefOr[Date] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object ManagementGroupDetailsProperties {
  
  @scala.inline
  def apply(): ManagementGroupDetailsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementGroupDetailsProperties]
  }
  
  @scala.inline
  implicit class ManagementGroupDetailsPropertiesOps[Self <: ManagementGroupDetailsProperties] (val x: Self) extends AnyVal {
    
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
    def setManagementGroupType(value: String): Self = this.set("managementGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementGroupType: Self = this.set("managementGroupType", js.undefined)
    
    @scala.inline
    def setParent(value: ParentGroupInfo): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setUpdatedBy(value: String): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedBy: Self = this.set("updatedBy", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: Date): Self = this.set("updatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTime: Self = this.set("updatedTime", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
