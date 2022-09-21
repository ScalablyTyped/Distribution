package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesResponse extends StObject {
  
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A summary of the data lake resources.
    */
  var ResourceInfoList: js.UndefOr[typings.awsSdk.lakeformationMod.ResourceInfoList] = js.undefined
}
object ListResourcesResponse {
  
  inline def apply(): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResponse]
  }
  
  extension [Self <: ListResourcesResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceInfoList(value: ResourceInfoList): Self = StObject.set(x, "ResourceInfoList", value.asInstanceOf[js.Any])
    
    inline def setResourceInfoListUndefined: Self = StObject.set(x, "ResourceInfoList", js.undefined)
    
    inline def setResourceInfoListVarargs(value: ResourceInfo*): Self = StObject.set(x, "ResourceInfoList", js.Array(value*))
  }
}
