package typings.chrome.global.chrome

import typings.chrome.chrome.alarms.Alarm
import typings.chrome.chrome.alarms.AlarmCreateInfo
import typings.chrome.chrome.alarms.AlarmEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  @scala.inline
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def clear(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def clear(name: Unit, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
  @scala.inline
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def create(alarmInfo: AlarmCreateInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(alarmInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], alarmInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.alarms.onAlarm")
  @js.native
  def onAlarm: AlarmEvent = js.native
  @scala.inline
  def onAlarm_=(x: AlarmEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAlarm")(x.asInstanceOf[js.Any])
}
