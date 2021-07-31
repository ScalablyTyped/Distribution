package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalendarStateRequest extends StObject {
  
  /**
    * (Optional) The specific time for which you want to get calendar state information, in ISO 8601 format. If you do not add AtTime, the current time is assumed.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.undefined
  
  /**
    * The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.
    */
  var CalendarNames: CalendarNameOrARNList
}
object GetCalendarStateRequest {
  
  @scala.inline
  def apply(CalendarNames: CalendarNameOrARNList): GetCalendarStateRequest = {
    val __obj = js.Dynamic.literal(CalendarNames = CalendarNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalendarStateRequest]
  }
  
  @scala.inline
  implicit class GetCalendarStateRequestMutableBuilder[Self <: GetCalendarStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtTime(value: ISO8601String): Self = StObject.set(x, "AtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtTimeUndefined: Self = StObject.set(x, "AtTime", js.undefined)
    
    @scala.inline
    def setCalendarNames(value: CalendarNameOrARNList): Self = StObject.set(x, "CalendarNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarNamesVarargs(value: CalendarNameOrARN*): Self = StObject.set(x, "CalendarNames", js.Array(value :_*))
  }
}
