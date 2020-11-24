package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActivitiesOutput extends js.Object {
  
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
  implicit class ListActivitiesOutputOps[Self <: ListActivitiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivitiesVarargs(value: ActivityListItem*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: ActivityList): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
