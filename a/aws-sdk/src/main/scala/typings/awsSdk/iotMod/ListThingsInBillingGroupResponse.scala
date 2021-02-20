package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingsInBillingGroupResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of things in the billing group.
    */
  var things: js.UndefOr[ThingNameList] = js.native
}
object ListThingsInBillingGroupResponse {
  
  @scala.inline
  def apply(): ListThingsInBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsInBillingGroupResponse]
  }
  
  @scala.inline
  implicit class ListThingsInBillingGroupResponseMutableBuilder[Self <: ListThingsInBillingGroupResponse] (val x: Self) extends AnyVal {
    
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
