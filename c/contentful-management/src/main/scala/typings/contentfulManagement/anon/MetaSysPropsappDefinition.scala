package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  appDefinition :{  sys :contentful-management.contentful-management/dist/typings/common-types.MetaLinkProps}} */
trait MetaSysPropsappDefinition extends StObject {
  
  var appDefinition: Sys
  
  var archivedVersion: js.UndefOr[Double] = js.undefined
  
  var createdAt: String
  
  var createdBy: js.UndefOr[Sys] = js.undefined
  
  var id: String
  
  var publishedVersion: js.UndefOr[Double] = js.undefined
  
  var space: js.UndefOr[Sys] = js.undefined
  
  var status: js.UndefOr[Sys] = js.undefined
  
  var `type`: String
  
  var updatedAt: String
  
  var updatedBy: js.UndefOr[Sys] = js.undefined
  
  var version: Double
}
object MetaSysPropsappDefinition {
  
  inline def apply(
    appDefinition: Sys,
    createdAt: String,
    id: String,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropsappDefinition = {
    val __obj = js.Dynamic.literal(appDefinition = appDefinition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropsappDefinition]
  }
  
  extension [Self <: MetaSysPropsappDefinition](x: Self) {
    
    inline def setAppDefinition(value: Sys): Self = StObject.set(x, "appDefinition", value.asInstanceOf[js.Any])
    
    inline def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
    
    inline def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
    
    inline def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
