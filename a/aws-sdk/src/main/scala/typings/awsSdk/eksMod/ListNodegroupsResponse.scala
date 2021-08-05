package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodegroupsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListNodegroups request. When the results of a ListNodegroups request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all of the node groups associated with the specified cluster.
    */
  var nodegroups: js.UndefOr[StringList] = js.undefined
}
object ListNodegroupsResponse {
  
  inline def apply(): ListNodegroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodegroupsResponse]
  }
  
  extension [Self <: ListNodegroupsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setNodegroups(value: StringList): Self = StObject.set(x, "nodegroups", value.asInstanceOf[js.Any])
    
    inline def setNodegroupsUndefined: Self = StObject.set(x, "nodegroups", js.undefined)
    
    inline def setNodegroupsVarargs(value: String*): Self = StObject.set(x, "nodegroups", js.Array(value :_*))
  }
}
