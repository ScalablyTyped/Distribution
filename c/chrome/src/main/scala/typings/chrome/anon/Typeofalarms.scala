package typings.chrome.anon

import typings.chrome.chrome.alarms.Alarm
import typings.chrome.chrome.alarms.AlarmCreateInfo
import typings.chrome.chrome.alarms.AlarmEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalarms extends StObject {
  
  def clear(): js.Promise[Boolean] = js.native
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: String): js.Promise[Boolean] = js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  def clearAll(): js.Promise[Boolean] = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  def create(alarmInfo: AlarmCreateInfo): js.Promise[Unit] = js.native
  def create(alarmInfo: AlarmCreateInfo, callback: js.Function0[Unit]): Unit = js.native
  def create(name: String, alarmInfo: AlarmCreateInfo): js.Promise[Unit] = js.native
  def create(name: String, alarmInfo: AlarmCreateInfo, callback: js.Function0[Unit]): Unit = js.native
  
  def get(): js.Promise[Alarm] = js.native
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  def get(name: String): js.Promise[Alarm] = js.native
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  
  def getAll(): js.Promise[js.Array[Alarm]] = js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
  
  var onAlarm: AlarmEvent = js.native
}
