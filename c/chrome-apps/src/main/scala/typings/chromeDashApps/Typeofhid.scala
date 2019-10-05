package typings.chromeDashApps

import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.hid.DeviceOptions
import typings.chromeDashApps.chrome.hid.HidDeviceInfo
import typings.chromeDashApps.chrome.hid.UserSelectedDevicePickerOptions
import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhid extends js.Object {
  /**
    * Event generated when a device is added to the system.
    * Events are only broadcast to apps that
    * have permission to access the device. Permission may
    * have been granted at install time or when the user
    * accepted an optional permission.
    * @since Chrome 41.
    * @see[permissions.request]{@link https://developer.chrome.com/apps/permissions#method-request}
    */
  val onDeviceAdded: Event[js.Function1[/* device */ HidDeviceInfo, Unit]] = js.native
  /**
    * Event generated when a device is removed from the system.
    * The callback will contain the deviceId property of the device passed to onDeviceAdded.
    * @since Chrome 41.
    * @see[See onDeviceAdded for which events are delivered]{@link https://developer.chrome.com/apps/hid#event-onDeviceAdded}.
    */
  val onDeviceRemoved: Event[js.Function1[/* deviceId */ integer, Unit]] = js.native
  /**
    * Open a connection to an HID device for communication.
    * @param deviceId The HidDeviceInfo.deviceId of the device to open.
    * @param callback The callback function returns an object, containing the connectionId.
    *                 The connectionId is the opaque ID used to identify this connection in all other functions.
    */
  def connect(deviceId: integer, callback: js.Function1[/* connection */ Anon_ConnectionId, Unit]): Unit = js.native
  /**
    * Disconnect from a device.
    * Invoking operations on a device after calling this is safe but has no effect.
    * @param connectionId The connectionId returned by connect.
    * @param [callback]
    */
  def disconnect(connectionId: integer): Unit = js.native
  def disconnect(connectionId: integer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enumerate connected HID devices.
    * @param options The properties to search for on target devices.
    * @param callback
    */
  def getDevices(options: DeviceOptions, callback: js.Function1[/* devices */ js.Array[HidDeviceInfo], Unit]): Unit = js.native
  /**
    * @requires(dev) **Dev channel only!**
    * @see[Learn more]{@link https://developer.chrome.com/apps/api_index#dev_apis}
    * @description
    * Presents a device picker to the user and returns
    * HidDeviceInfo objects for the devices selected. If the user
    * cancels the picker devices will be empty. A user gesture is
    * required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled. If multiple
    * filters are provided devices matching any filter will be displayed.
    * @param callback Invoked with a list of chosen Devices.
    */
  def getUserSelectedDevices(callback: js.Function1[/* devices */ HidDeviceInfo, Unit]): Unit = js.native
  /**
    * @since Chrome 45.
    * @requires(dev) **Dev channel only!**
    * @see[Learn more]{@link https://developer.chrome.com/apps/api_index#dev_apis}
    * Presents a device picker to the user and returns
    * HidDeviceInfo objects for the devices selected. If the user
    * cancels the picker devices will be empty. A user gesture is
    * required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled. If multiple
    * filters are provided devices matching any filter will be displayed.
    * @param options Configuration of the device picker dialog box.
    * @param callback Invoked with a list of chosen Devices.
    */
  def getUserSelectedDevices(
    options: UserSelectedDevicePickerOptions,
    callback: js.Function1[/* devices */ HidDeviceInfo, Unit]
  ): Unit = js.native
  /**
    * Receive the next input report from the device.
    * @param connectionId The connectionId returned by connect.
    * @param callback The callback will return these parameters:
    *                      * reportId - The report ID or 0 if none.
    *                      * data - The report data, the report ID prefix (if present) is removed.
    */
  def receive(
    connectionId: integer,
    callback: js.Function2[/* reportId */ integer, /* data */ ArrayBuffer, Unit]
  ): Unit = js.native
  /**
    * Request a feature report from the device.
    * @param connectionId The connectionId returned by connect.
    * @param reportId The report ID, or 0 if none.
    * @param callback Will provide `data` which contain the report data, including a report ID prefix if one is sent by the device.
    */
  def receiveFeatureReport(connectionId: integer, reportId: integer, callback: js.Function1[/* data */ ArrayBuffer, Unit]): Unit = js.native
  /**
    * Send an output report to the device.
    * Note: Do not include a report ID prefix in data. It will be added if necessary.
    * @param connectionId The connectionId returned by connect.
    * @param reportId reportId - The report ID or 0 if none.
    * @param data The report data.
    * @param callback
    */
  def send(connectionId: integer, reportId: integer, data: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Send a feature report to the device.
    * Note: Do not include a report ID prefix in data. It will be added if necessary.
    * @param connectionId The connectionId returned by connect.
    * @param reportId The report ID to use, or 0 if none.
    * @param data The report data.
    * @param callback
    */
  def sendFeatureReport(connectionId: integer, reportId: integer, data: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

