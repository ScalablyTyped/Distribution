package typings.chromeApps.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.enterprise.*
// #region chrome.events
////////////
// Events //
////////////
/**
  * The chrome.events namespace contains common types used by APIs
  * dispatching events to notify you when something interesting happens.
  *
  * An Event is an object that allows you to be notified when something interesting happens.
  * Here's an example of using the chrome.alarms.onAlarm event to be notified whenever an alarm has elapsed:
  * @example
  * chrome.alarms.onAlarm.addListener(function(alarm) {
  *   appendToLog('alarms.onAlarm --'
  *               + ' name: '          + alarm.name
  *               + ' scheduledTime: ' + alarm.scheduledTime);
  * });
  * @description
  * As the example shows, you register for notification using addListener().
  * The argument to addListener() is always a function that you define to
  * handle the event, but the parameters to the function depend on which
  * event you're handling. Checking the documentation for alarms.onAlarm,
  * you can see that the function has a single parameter: an alarms.Alarm
  * object that has details about the elapsed alarm.
  * @since Chrome 25.
  */
object events
