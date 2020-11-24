package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingGroupsRequest extends js.Object {
  
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
  implicit class ListThingGroupsRequestOps[Self <: ListThingGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNamePrefixFilter(value: ThingGroupName): Self = this.set("namePrefixFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefixFilter: Self = this.set("namePrefixFilter", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setParentGroup(value: ThingGroupName): Self = this.set("parentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentGroup: Self = this.set("parentGroup", js.undefined)
    
    @scala.inline
    def setRecursive(value: RecursiveWithoutDefault): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
