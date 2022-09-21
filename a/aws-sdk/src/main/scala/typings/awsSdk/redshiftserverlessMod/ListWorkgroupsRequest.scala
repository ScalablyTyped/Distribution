package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkgroupsRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var maxResults: js.UndefOr[ListWorkgroupsRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListWorkgroups operation returns a nextToken, you can include the returned nextToken in subsequent ListNamespaces operations, which returns results in the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListWorkgroupsRequest {
  
  inline def apply(): ListWorkgroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkgroupsRequest]
  }
  
  extension [Self <: ListWorkgroupsRequest](x: Self) {
    
    inline def setMaxResults(value: ListWorkgroupsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
