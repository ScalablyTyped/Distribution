package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  space :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   environment :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps},   contentType :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps}} */
trait MetaSysPropsspacesysMetaL extends StObject {
  
  var archivedVersion: js.UndefOr[Double] = js.undefined
  
  var contentType: Sys
  
  var createdAt: String
  
  var createdBy: js.UndefOr[Sys] = js.undefined
  
  var environment: Sys
  
  var id: String
  
  var publishedVersion: js.UndefOr[Double] = js.undefined
  
  var space: js.UndefOr[Sys] & Sys
  
  var status: js.UndefOr[Sys] = js.undefined
  
  var `type`: String
  
  var updatedAt: String
  
  var updatedBy: js.UndefOr[Sys] = js.undefined
  
  var version: Double
}
object MetaSysPropsspacesysMetaL {
  
  inline def apply(
    contentType: Sys,
    createdAt: String,
    environment: Sys,
    id: String,
    space: js.UndefOr[Sys] & Sys,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsspacesysMetaL = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsspacesysMetaL]
  }
  
  extension [Self <: MetaSysPropsspacesysMetaL](x: Self) {
    
    inline def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
    
    inline def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
    
    inline def setContentType(value: Sys): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setEnvironment(value: Sys): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
    
    inline def setSpace(value: js.UndefOr[Sys] & Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
