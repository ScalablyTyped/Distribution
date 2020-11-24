package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  space :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   environment :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   contentType :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps}} */
@js.native
trait MetaSysPropsspacesysMetaL extends js.Object {
  
  var archivedVersion: js.UndefOr[Double] = js.native
  
  var contentType: Sys = js.native
  
  var createdAt: String = js.native
  
  var createdBy: js.UndefOr[Sys] = js.native
  
  var environment: Sys = js.native
  
  var id: String = js.native
  
  var publishedVersion: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[Sys] with Sys = js.native
  
  var status: js.UndefOr[Sys] = js.native
  
  var `type`: String = js.native
  
  var updatedAt: String = js.native
  
  var updatedBy: js.UndefOr[Sys] = js.native
  
  var version: Double = js.native
}
object MetaSysPropsspacesysMetaL {
  
  @scala.inline
  def apply(
    contentType: Sys,
    createdAt: String,
    environment: Sys,
    id: String,
    space: js.UndefOr[Sys] with Sys,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsspacesysMetaL = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsspacesysMetaL]
  }
  
  @scala.inline
  implicit class MetaSysPropsspacesysMetaLOps[Self <: MetaSysPropsspacesysMetaL] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: Sys): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Sys): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: js.UndefOr[Sys] with Sys): Self = this.set("space", value.asInstanceOf[js.Any])
    
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
    def setStatus(value: Sys): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedBy: Self = this.set("updatedBy", js.undefined)
  }
}
