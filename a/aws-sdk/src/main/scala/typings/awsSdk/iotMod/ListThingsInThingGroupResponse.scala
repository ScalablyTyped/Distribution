package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingsInThingGroupResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The things in the specified thing group.
    */
  var things: js.UndefOr[ThingNameList] = js.native
}
object ListThingsInThingGroupResponse {
  
  @scala.inline
  def apply(): ListThingsInThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsInThingGroupResponse]
  }
  
  @scala.inline
  implicit class ListThingsInThingGroupResponseMutableBuilder[Self <: ListThingsInThingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThings(value: ThingNameList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    @scala.inline
    def setThingsVarargs(value: ThingName*): Self = StObject.set(x, "things", js.Array(value :_*))
  }
}
