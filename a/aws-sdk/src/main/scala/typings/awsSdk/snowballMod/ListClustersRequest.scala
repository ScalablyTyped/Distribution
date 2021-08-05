package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersRequest extends StObject {
  
  /**
    * The number of ClusterListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ClusterListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListClustersRequest {
  
  inline def apply(): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersRequest]
  }
  
  extension [Self <: ListClustersRequest](x: Self) {
    
    inline def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
