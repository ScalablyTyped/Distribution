package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalendarStateResponse extends StObject {
  
  /**
    * The time, as an ISO 8601 string, that you specified in your command. If you don't specify a time, GetCalendarState uses the current time.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.undefined
  
  /**
    * The time, as an ISO 8601 string, that the calendar state will change. If the current calendar state is OPEN, NextTransitionTime indicates when the calendar state changes to CLOSED, and vice-versa.
    */
  var NextTransitionTime: js.UndefOr[ISO8601String] = js.undefined
  
  /**
    * The state of the calendar. An OPEN calendar indicates that actions are allowed to proceed, and a CLOSED calendar indicates that actions aren't allowed to proceed.
    */
  var State: js.UndefOr[CalendarState] = js.undefined
}
object GetCalendarStateResponse {
  
  inline def apply(): GetCalendarStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalendarStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalendarStateResponse] (val x: Self) extends AnyVal {
    
    inline def setAtTime(value: ISO8601String): Self = StObject.set(x, "AtTime", value.asInstanceOf[js.Any])
    
    inline def setAtTimeUndefined: Self = StObject.set(x, "AtTime", js.undefined)
    
    inline def setNextTransitionTime(value: ISO8601String): Self = StObject.set(x, "NextTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setNextTransitionTimeUndefined: Self = StObject.set(x, "NextTransitionTime", js.undefined)
    
    inline def setState(value: CalendarState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
