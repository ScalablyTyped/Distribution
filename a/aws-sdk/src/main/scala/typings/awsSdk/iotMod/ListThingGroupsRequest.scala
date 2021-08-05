package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  
  /**
    * A filter that limits the results to those with the specified name prefix.
    */
  var namePrefixFilter: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A filter that limits the results to those with the specified parent group.
    */
  var parentGroup: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * If true, return child groups as well.
    */
  var recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined
}
object ListThingGroupsRequest {
  
  inline def apply(): ListThingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsRequest]
  }
  
  extension [Self <: ListThingGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamePrefixFilter(value: ThingGroupName): Self = StObject.set(x, "namePrefixFilter", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixFilterUndefined: Self = StObject.set(x, "namePrefixFilter", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setParentGroup(value: ThingGroupName): Self = StObject.set(x, "parentGroup", value.asInstanceOf[js.Any])
    
    inline def setParentGroupUndefined: Self = StObject.set(x, "parentGroup", js.undefined)
    
    inline def setRecursive(value: RecursiveWithoutDefault): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
