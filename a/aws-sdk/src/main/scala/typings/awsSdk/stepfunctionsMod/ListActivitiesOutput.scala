package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActivitiesOutput extends StObject {
  
  /**
    * The list of activities.
    */
  var activities: ActivityList = js.native
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
}
object ListActivitiesOutput {
  
  @scala.inline
  def apply(activities: ActivityList): ListActivitiesOutput = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivitiesOutput]
  }
  
  @scala.inline
  implicit class ListActivitiesOutputMutableBuilder[Self <: ListActivitiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: ActivityList): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesVarargs(value: ActivityListItem*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
