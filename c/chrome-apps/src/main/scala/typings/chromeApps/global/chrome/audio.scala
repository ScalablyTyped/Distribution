package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.audio.AudioDeviceInfo
import typings.chromeApps.chrome.audio.DeviceIdLists
import typings.chromeApps.chrome.audio.Filter
import typings.chromeApps.chrome.audio.SetDeviceProperties
import typings.chromeApps.chrome.audio.StreamType
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.app.*
// #region chrome.audio
///////////
// Audio //
///////////
/**
  * @since Chrome 59.
  * @requires Permissions: 'audio'
  * @description
  * The chrome.audio API is provided to allow users to get information
  * about and control the audio devices attached to the system.
  * This API is currently only available in kiosk mode for ChromeOS.
  */
@JSGlobal("chrome.audio")
@js.native
object audio extends js.Object {
  
  def getDevices(callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = js.native
  /**
    * Gets a list of audio devices filtered based on |filter|.
    */
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = js.native
  
  /**
    * Gets the system-wide mute state for the specified stream type.
    * @param streamType Stream type for which mute state should be fetched.
    * @param callback Callback reporting whether mute is set or not for specified stream type.
    */
  def getMute(streamType: StreamType, callback: js.Function1[/* value */ Boolean, Unit]): Unit = js.native
  
  /**
    * Fired when audio devices change, either new devices being added,
    * or existing devices being removed.
    * callback `devices` contains a list of all present audio devices after the change.
    */
  val onDeviceListChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]] = js.native
  
  /** Fired when sound level changes for an active audio device. */
  val onLevelChanged: typings.chromeApps.chrome.events.Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]] = js.native
  
  /**
    * Fired when the mute state of the audio input or output changes.
    * Note that mute state is system-wide and the new value applies to
    * every audio device with specified stream type.
    */
  val onMuteChanged: typings.chromeApps.chrome.events.Event[js.Function2[/* streamType */ js.Array[StreamType], /* isMuted */ Boolean, Unit]] = js.native
  
  /** Sets lists of active input and/or output devices. */
  def setDevices(ids: js.Array[DeviceIdLists | String], callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets mute state for a stream type. The mute state will apply to all audio devices with the specified audio stream type.
    * @param streamType Stream type for which mute state should be set.
    * @param isMuted New mute value.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this: function() {...};
    */
  def setMute(streamType: StreamType, isMuted: Boolean): Unit = js.native
  def setMute(streamType: StreamType, isMuted: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /** Sets the properties for the input or output device. */
  def setProperties(id: String, properties: SetDeviceProperties, callback: js.Function0[Unit]): Unit = js.native
}
