package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  space :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps}} */
@js.native
trait MetaSysPropsspacesysMetaLArchivedVersion extends StObject {
  
  var archivedVersion: js.UndefOr[Double] = js.native
  
  var createdAt: String = js.native
  
  var createdBy: js.UndefOr[Sys] = js.native
  
  var id: String = js.native
  
  var publishedVersion: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[Sys] with Sys = js.native
  
  var status: js.UndefOr[Sys] = js.native
  
  var `type`: String = js.native
  
  var updatedAt: String = js.native
  
  var updatedBy: js.UndefOr[Sys] = js.native
  
  var version: Double = js.native
}
object MetaSysPropsspacesysMetaLArchivedVersion {
  
  @scala.inline
  def apply(
    createdAt: String,
    id: String,
    space: js.UndefOr[Sys] with Sys,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsspacesysMetaLArchivedVersion = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsspacesysMetaLArchivedVersion]
  }
  
  @scala.inline
  implicit class MetaSysPropsspacesysMetaLArchivedVersionMutableBuilder[Self <: MetaSysPropsspacesysMetaLArchivedVersion] (val x: Self) extends AnyVal {
    
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
    def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
    
    @scala.inline
    def setSpace(value: js.UndefOr[Sys] with Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
