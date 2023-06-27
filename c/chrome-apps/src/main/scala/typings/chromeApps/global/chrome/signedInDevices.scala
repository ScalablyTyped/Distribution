package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.signedInDevices.DeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.signedInDevices
//////////////////////
// SignedIn Devices //
//////////////////////
/**
  * @requires Requires Chrome *dev*
  * Use the *chrome.signedInDevices* API to get a list of devices
  * signed into chrome with the same account as the current profile.
  */
object signedInDevices {
  
  @JSGlobal("chrome.signedInDevices")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  inline def get(callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Gets the array of signed in devices, signed into the same account as the current profile.
    * @param isLocal If true only return the information for the local device.
    * If false or omitted return the list of all devices including the local device.
    * @param callback The callback to be invoked with the array of DeviceInfo objects.
    */
  inline def get(isLocal: Boolean, callback: js.Function1[/* devices */ js.Array[DeviceInfo], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(isLocal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when the DeviceInfo object of any of the signed in devices
    * changes, or when a device is added or removed.
    * Provides *devices*:
    * The array of all signed in devices.
    */
  @JSGlobal("chrome.signedInDevices.onDeviceInfoChange")
  @js.native
  val onDeviceInfoChange: typings.chromeApps.chrome.events.Event[js.Function1[/* devices */ js.Array[DeviceInfo], Unit]] = js.native
}
