package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActivitiesResponse extends js.Object {
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[typings.awsSdk.workdocsMod.UserActivities] = js.native
}
object DescribeActivitiesResponse {
  
  @scala.inline
  def apply(): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
  
  @scala.inline
  implicit class DescribeActivitiesResponseOps[Self <: DescribeActivitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: MarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setUserActivitiesVarargs(value: Activity*): Self = this.set("UserActivities", js.Array(value :_*))
    
    @scala.inline
    def setUserActivities(value: UserActivities): Self = this.set("UserActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserActivities: Self = this.set("UserActivities", js.undefined)
  }
}
