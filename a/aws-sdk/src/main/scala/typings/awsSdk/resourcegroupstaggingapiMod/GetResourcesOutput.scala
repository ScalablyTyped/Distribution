package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesOutput extends StObject {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of resource ARNs and the tags (keys and values) associated with each.
    */
  var ResourceTagMappingList: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ResourceTagMappingList] = js.undefined
}
object GetResourcesOutput {
  
  inline def apply(): GetResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesOutput]
  }
  
  extension [Self <: GetResourcesOutput](x: Self) {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setResourceTagMappingList(value: ResourceTagMappingList): Self = StObject.set(x, "ResourceTagMappingList", value.asInstanceOf[js.Any])
    
    inline def setResourceTagMappingListUndefined: Self = StObject.set(x, "ResourceTagMappingList", js.undefined)
    
    inline def setResourceTagMappingListVarargs(value: ResourceTagMapping*): Self = StObject.set(x, "ResourceTagMappingList", js.Array(value :_*))
  }
}
