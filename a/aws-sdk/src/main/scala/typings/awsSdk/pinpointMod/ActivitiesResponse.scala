package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitiesResponse extends StObject {
  
  /**
    * An array of responses, one for each activity that was performed by the campaign.
    */
  var Item: ListOfActivityResponse
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ActivitiesResponse {
  
  @scala.inline
  def apply(Item: ListOfActivityResponse): ActivitiesResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitiesResponse]
  }
  
  @scala.inline
  implicit class ActivitiesResponseMutableBuilder[Self <: ActivitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfActivityResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: ActivityResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
