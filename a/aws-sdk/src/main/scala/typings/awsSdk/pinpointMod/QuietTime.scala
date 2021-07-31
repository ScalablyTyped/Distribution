package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuietTime extends StObject {
  
  /**
    * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var End: js.UndefOr[string] = js.undefined
  
  /**
    * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var Start: js.UndefOr[string] = js.undefined
}
object QuietTime {
  
  @scala.inline
  def apply(): QuietTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuietTime]
  }
  
  @scala.inline
  implicit class QuietTimeMutableBuilder[Self <: QuietTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: string): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
