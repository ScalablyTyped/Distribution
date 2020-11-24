package typings.contentfulManagement.tagMod

import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.anon.SysId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<contentful-management.contentful-management/dist/typings/common-types.MetaSysProps, 'id' | 'space' | 'version' | 'createdAt' | 'createdBy' | 'updatedAt' | 'updatedBy'> & {  type :'Tag',   environment :{  sys :{  id :string,   type :'Link',   linkType :'Environment'}}} */
@js.native
trait TagSysProps extends js.Object {
  
  var createdAt: String = js.native
  
  var createdBy: js.UndefOr[Sys] = js.native
  
  var environment: SysId = js.native
  
  var id: String = js.native
  
  var space: js.UndefOr[Sys] = js.native
  
  var `type`: typings.contentfulManagement.contentfulManagementStrings.Tag = js.native
  
  var updatedAt: String = js.native
  
  var updatedBy: js.UndefOr[Sys] = js.native
  
  var version: Double = js.native
}
object TagSysProps {
  
  @scala.inline
  def apply(
    createdAt: String,
    environment: SysId,
    id: String,
    `type`: typings.contentfulManagement.contentfulManagementStrings.Tag,
    updatedAt: String,
    version: Double
  ): TagSysProps = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSysProps]
  }
  
  @scala.inline
  implicit class TagSysPropsOps[Self <: TagSysProps] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: SysId): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.contentfulManagement.contentfulManagementStrings.Tag): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: Sys): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setSpace(value: Sys): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedBy: Self = this.set("updatedBy", js.undefined)
  }
}
