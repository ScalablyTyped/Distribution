package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseLogEventsResult extends js.Object {
  
  /**
    * A token used for advancing to the previous page of results from your get relational database log events request.
    */
  var nextBackwardToken: js.UndefOr[String] = js.native
  
  /**
    * A token used for advancing to the next page of results from your get relational database log events request.
    */
  var nextForwardToken: js.UndefOr[String] = js.native
  
  /**
    * An object describing the result of your get relational database log events request.
    */
  var resourceLogEvents: js.UndefOr[LogEventList] = js.native
}
object GetRelationalDatabaseLogEventsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseLogEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogEventsResultOps[Self <: GetRelationalDatabaseLogEventsResult] (val x: Self) extends AnyVal {
    
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
    def setNextBackwardToken(value: String): Self = this.set("nextBackwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextBackwardToken: Self = this.set("nextBackwardToken", js.undefined)
    
    @scala.inline
    def setNextForwardToken(value: String): Self = this.set("nextForwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextForwardToken: Self = this.set("nextForwardToken", js.undefined)
    
    @scala.inline
    def setResourceLogEventsVarargs(value: LogEvent*): Self = this.set("resourceLogEvents", js.Array(value :_*))
    
    @scala.inline
    def setResourceLogEvents(value: LogEventList): Self = this.set("resourceLogEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLogEvents: Self = this.set("resourceLogEvents", js.undefined)
  }
}
