package typings
package cordovaDashPluginDashBatteryDashStatusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* ev */ stdLib.Event, _]): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterycritical(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterycritical,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterycritical(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterycritical,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterylow(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterylow,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterylow(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterylow,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterystatus(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterystatus,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Adds a listener for an event from the BatteryStatus plugin.
       * @param type      the event to listen for
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param listener  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("addEventListener")
  def addEventListener_batterystatus(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterystatus,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def onbatterycritical(`type`: BatteryStatusEvent): scala.Unit = js.native
  def onbatterylow(`type`: BatteryStatusEvent): scala.Unit = js.native
  def onbatterystatus(`type`: BatteryStatusEvent): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* ev */ stdLib.Event, _]): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterycritical(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterycritical,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterycritical(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterycritical,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterylow(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterylow,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterylow(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterylow,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterystatus(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterystatus,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _]
  ): scala.Unit = js.native
  /**
       * Removes a listener for an event from the BatteryStatus plugin.
       * @param type      The event to stop listening for.
       *                  batterystatus: event fires when the percentage of battery charge
       *                  changes by at least 1 percent, or if the device is plugged in or unplugged.
       *                  batterycritical: event fires when the percentage of battery charge has reached
       *                  the critical battery threshold. The value is device-specific.
       *                  batterylow: event fires when the percentage of battery charge has
       *                  reached the low battery threshold, device-specific value.
       * @param callback  the function that executes when the event fires. The function is
       *                  passed an BatteryStatusEvent object as a parameter.
       */
  @JSName("removeEventListener")
  def removeEventListener_batterystatus(
    `type`: cordovaDashPluginDashBatteryDashStatusLib.cordovaDashPluginDashBatteryDashStatusLibStrings.batterystatus,
    listener: js.Function1[/* ev */ BatteryStatusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

