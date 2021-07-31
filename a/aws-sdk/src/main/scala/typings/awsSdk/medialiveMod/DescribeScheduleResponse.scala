package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduleResponse extends StObject {
  
  /**
    * The next token; for use in pagination.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The list of actions in the schedule.
    */
  var ScheduleActions: js.UndefOr[listOfScheduleAction] = js.undefined
}
object DescribeScheduleResponse {
  
  @scala.inline
  def apply(): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
  
  @scala.inline
  implicit class DescribeScheduleResponseMutableBuilder[Self <: DescribeScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionsUndefined: Self = StObject.set(x, "ScheduleActions", js.undefined)
    
    @scala.inline
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value :_*))
  }
}
