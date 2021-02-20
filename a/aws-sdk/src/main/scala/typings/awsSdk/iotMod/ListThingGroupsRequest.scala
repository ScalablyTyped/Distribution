package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  
  /**
    * A filter that limits the results to those with the specified name prefix.
    */
  var namePrefixFilter: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A filter that limits the results to those with the specified parent group.
    */
  var parentGroup: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * If true, return child groups as well.
    */
  var recursive: js.UndefOr[RecursiveWithoutDefault] = js.native
}
object ListThingGroupsRequest {
  
  @scala.inline
  def apply(): ListThingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsRequest]
  }
  
  @scala.inline
  implicit class ListThingGroupsRequestMutableBuilder[Self <: ListThingGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNamePrefixFilter(value: ThingGroupName): Self = StObject.set(x, "namePrefixFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixFilterUndefined: Self = StObject.set(x, "namePrefixFilter", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setParentGroup(value: ThingGroupName): Self = StObject.set(x, "parentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupUndefined: Self = StObject.set(x, "parentGroup", js.undefined)
    
    @scala.inline
    def setRecursive(value: RecursiveWithoutDefault): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
