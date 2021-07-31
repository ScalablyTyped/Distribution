package typings.contentfulManagement.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  organizationMembership :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   user :std.Record<string, any> | null,   invitationUrl :string,   status :string} */
trait MetaSysPropsorganizationM extends StObject {
  
  var archivedVersion: js.UndefOr[Double] = js.undefined
  
  var createdAt: String
  
  var createdBy: js.UndefOr[Sys] = js.undefined
  
  var id: String
  
  var invitationUrl: String
  
  var organizationMembership: Sys
  
  var publishedVersion: js.UndefOr[Double] = js.undefined
  
  var space: js.UndefOr[Sys] = js.undefined
  
  var status: js.UndefOr[Sys] & String
  
  var `type`: String
  
  var updatedAt: String
  
  var updatedBy: js.UndefOr[Sys] = js.undefined
  
  var user: (Record[String, js.Any]) | Null
  
  var version: Double
}
object MetaSysPropsorganizationM {
  
  @scala.inline
  def apply(
    createdAt: String,
    id: String,
    invitationUrl: String,
    organizationMembership: Sys,
    status: js.UndefOr[Sys] & String,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsorganizationM = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitationUrl = invitationUrl.asInstanceOf[js.Any], organizationMembership = organizationMembership.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], user = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsorganizationM]
  }
  
  @scala.inline
  implicit class MetaSysPropsorganizationMMutableBuilder[Self <: MetaSysPropsorganizationM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationUrl(value: String): Self = StObject.set(x, "invitationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationMembership(value: Sys): Self = StObject.set(x, "organizationMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
    
    @scala.inline
    def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setStatus(value: js.UndefOr[Sys] & String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    @scala.inline
    def setUser(value: Record[String, js.Any]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
