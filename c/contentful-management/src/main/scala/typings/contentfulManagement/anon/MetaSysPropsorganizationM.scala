package typings.contentfulManagement.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  organizationMembership :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   user :std.Record<string, any> | null,   invitationUrl :string,   status :string} */
@js.native
trait MetaSysPropsorganizationM extends js.Object {
  
  var archivedVersion: js.UndefOr[Double] = js.native
  
  var createdAt: String = js.native
  
  var createdBy: js.UndefOr[Sys] = js.native
  
  var id: String = js.native
  
  var invitationUrl: String = js.native
  
  var organizationMembership: Sys = js.native
  
  var publishedVersion: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[Sys] = js.native
  
  var status: js.UndefOr[Sys] with String = js.native
  
  var `type`: String = js.native
  
  var updatedAt: String = js.native
  
  var updatedBy: js.UndefOr[Sys] = js.native
  
  var user: (Record[String, _]) | Null = js.native
  
  var version: Double = js.native
}
object MetaSysPropsorganizationM {
  
  @scala.inline
  def apply(
    createdAt: String,
    id: String,
    invitationUrl: String,
    organizationMembership: Sys,
    status: js.UndefOr[Sys] with String,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsorganizationM = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitationUrl = invitationUrl.asInstanceOf[js.Any], organizationMembership = organizationMembership.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsorganizationM]
  }
  
  @scala.inline
  implicit class MetaSysPropsorganizationMOps[Self <: MetaSysPropsorganizationM] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationUrl(value: String): Self = this.set("invitationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationMembership(value: Sys): Self = this.set("organizationMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: js.UndefOr[Sys] with String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedVersion(value: Double): Self = this.set("archivedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivedVersion: Self = this.set("archivedVersion", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: Sys): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setPublishedVersion(value: Double): Self = this.set("publishedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedVersion: Self = this.set("publishedVersion", js.undefined)
    
    @scala.inline
    def setSpace(value: Sys): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedBy: Self = this.set("updatedBy", js.undefined)
    
    @scala.inline
    def setUser(value: Record[String, _]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
}
