package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceLFTagsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The database, table, or column resource for which you want to return LF-tags.
    */
  var Resource: typings.awsSdk.lakeformationMod.Resource
  
  /**
    * Indicates whether to show the assigned LF-tags.
    */
  var ShowAssignedLFTags: js.UndefOr[BooleanNullable] = js.undefined
}
object GetResourceLFTagsRequest {
  
  inline def apply(Resource: Resource): GetResourceLFTagsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceLFTagsRequest]
  }
  
  extension [Self <: GetResourceLFTagsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setShowAssignedLFTags(value: BooleanNullable): Self = StObject.set(x, "ShowAssignedLFTags", value.asInstanceOf[js.Any])
    
    inline def setShowAssignedLFTagsUndefined: Self = StObject.set(x, "ShowAssignedLFTags", js.undefined)
  }
}
