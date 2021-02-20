package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingGroupsForThingResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}
object ListThingGroupsForThingResponse {
  
  @scala.inline
  def apply(): ListThingGroupsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsForThingResponse]
  }
  
  @scala.inline
  implicit class ListThingGroupsForThingResponseMutableBuilder[Self <: ListThingGroupsForThingResponse] (val x: Self) extends AnyVal {
    
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
