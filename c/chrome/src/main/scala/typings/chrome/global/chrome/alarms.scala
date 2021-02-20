package typings.chrome.global.chrome

import typings.chrome.chrome.alarms.Alarm
import typings.chrome.chrome.alarms.AlarmCreateInfo
import typings.chrome.chrome.alarms.AlarmEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Alarms
////////////////////
/**
  * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
  * Availability: Since Chrome 22.
  * Permissions:  "alarms"
  */
object alarms {
  
  @JSGlobal("chrome.alarms")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.alarms.clear")
  @js.native
  def clear(): Unit = js.native
  @JSGlobal("chrome.alarms.clear")
  @js.native
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  @JSGlobal("chrome.alarms.clear")
  @js.native
  def clear(name: js.UndefOr[scala.Nothing], callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  @JSGlobal("chrome.alarms.clear")
  @js.native
  def clear(name: String): Unit = js.native
  @JSGlobal("chrome.alarms.clear")
  @js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.alarms.clearAll")
  @js.native
  def clearAll(): Unit = js.native
  @JSGlobal("chrome.alarms.clearAll")
  @js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.alarms.create")
  @js.native
  def create(alarmInfo: AlarmCreateInfo): Unit = js.native
  @JSGlobal("chrome.alarms.create")
  @js.native
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = js.native
  
  @JSGlobal("chrome.alarms.get")
  @js.native
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  @JSGlobal("chrome.alarms.get")
  @js.native
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  
  @JSGlobal("chrome.alarms.getAll")
  @js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
  
  @JSGlobal("chrome.alarms.onAlarm")
  @js.native
  def onAlarm: AlarmEvent = js.native
  @scala.inline
  def onAlarm_=(x: AlarmEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAlarm")(x.asInstanceOf[js.Any])
}
