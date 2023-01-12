package typings.chromeApps.chrome

import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.alarms
////////////
// Alarms //
////////////
/**
  * @requires Permissions: 'alarms'
  * @since Chrome 22.
  * @description
  * Use the chrome.alarms API to schedule code to run
  * periodically or at a specified time in the future.
  */
object alarms {
  
  trait Alarm extends StObject {
    
    /** Name of this alarm. */
    var name: String
    
    /** If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
    var periodInMinutes: js.UndefOr[integer] = js.undefined
    
    /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
    var scheduledTime: integer
  }
  object Alarm {
    
    inline def apply(name: String, scheduledTime: integer): Alarm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alarm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutes(value: integer): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setScheduledTime(value: integer): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlarmCreateInfo extends StObject {
    
    /** Length of time in minutes after which the onAlarm event should fire.  */
    var delayInMinutes: js.UndefOr[integer] = js.undefined
    
    /** If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
    var periodInMinutes: js.UndefOr[integer] = js.undefined
    
    /** Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
    var when: js.UndefOr[integer] = js.undefined
  }
  object AlarmCreateInfo {
    
    inline def apply(): AlarmCreateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlarmCreateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlarmCreateInfo] (val x: Self) extends AnyVal {
      
      inline def setDelayInMinutes(value: integer): Self = StObject.set(x, "delayInMinutes", value.asInstanceOf[js.Any])
      
      inline def setDelayInMinutesUndefined: Self = StObject.set(x, "delayInMinutes", js.undefined)
      
      inline def setPeriodInMinutes(value: integer): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setWhen(value: integer): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  type AlarmEvent = Event[js.Function1[/* alarm */ Alarm, Unit]]
}
