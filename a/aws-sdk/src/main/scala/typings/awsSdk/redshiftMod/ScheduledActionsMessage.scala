package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledActionsMessage extends js.Object {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * List of retrieved scheduled actions. 
    */
  var ScheduledActions: js.UndefOr[ScheduledActionList] = js.native
}
object ScheduledActionsMessage {
  
  @scala.inline
  def apply(): ScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionsMessage]
  }
  
  @scala.inline
  implicit class ScheduledActionsMessageOps[Self <: ScheduledActionsMessage] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setScheduledActionsVarargs(value: ScheduledAction*): Self = this.set("ScheduledActions", js.Array(value :_*))
    
    @scala.inline
    def setScheduledActions(value: ScheduledActionList): Self = this.set("ScheduledActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActions: Self = this.set("ScheduledActions", js.undefined)
  }
}
