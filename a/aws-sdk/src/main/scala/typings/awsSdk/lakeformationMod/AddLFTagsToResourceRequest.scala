package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLFTagsToResourceRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The LF-tags to attach to the resource.
    */
  var LFTags: LFTagsList
  
  /**
    * The database, table, or column resource to which to attach an LF-tag.
    */
  var Resource: typings.awsSdk.lakeformationMod.Resource
}
object AddLFTagsToResourceRequest {
  
  inline def apply(LFTags: LFTagsList, Resource: Resource): AddLFTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(LFTags = LFTags.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLFTagsToResourceRequest]
  }
  
  extension [Self <: AddLFTagsToResourceRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setLFTags(value: LFTagsList): Self = StObject.set(x, "LFTags", value.asInstanceOf[js.Any])
    
    inline def setLFTagsVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTags", js.Array(value*))
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
