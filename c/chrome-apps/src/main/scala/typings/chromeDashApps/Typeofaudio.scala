package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.audioNs.AudioDeviceInfo
import typings.chromeDashApps.chromeNs.audioNs.DeviceIdLists
import typings.chromeDashApps.chromeNs.audioNs.Filter
import typings.chromeDashApps.chromeNs.audioNs.SetDeviceProperties
import typings.chromeDashApps.chromeNs.audioNs.StreamType
import typings.chromeDashApps.chromeNs.eventsNs.Event
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofaudio extends js.Object {
  /**
    * Fired when audio devices change, either new devices being added,
    * or existing devices being removed.
    * callback `devices` contains a list of all present audio devices after the change.
    */
  val onDeviceListChanged: Event[js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]] = js.native
  /** Fired when sound level changes for an active audio device. */
  val onLevelChanged: Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]] = js.native
  /**
    * Fired when the mute state of the audio input or output changes.
    * Note that mute state is system-wide and the new value applies to
    * every audio device with specified stream type.
    */
  val onMuteChanged: Event[js.Function2[/* streamType */ js.Array[StreamType], /* isMuted */ Boolean, Unit]] = js.native
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

