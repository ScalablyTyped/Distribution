package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingGroupsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}
object ListThingGroupsResponse {
  
  @scala.inline
  def apply(): ListThingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsResponse]
  }
  
  @scala.inline
  implicit class ListThingGroupsResponseMutableBuilder[Self <: ListThingGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThingGroups(value: ThingGroupNameAndArnList): Self = StObject.set(x, "thingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupsUndefined: Self = StObject.set(x, "thingGroups", js.undefined)
    
    @scala.inline
    def setThingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "thingGroups", js.Array(value :_*))
  }
}
