package typings
package chromeDashAppsLib

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
  val onDeviceListChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.audioNs.AudioDeviceInfo], 
      scala.Unit
    ]
  ] = js.native
  /** Fired when sound level changes for an active audio device. */
  val onLevelChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* deviceId */ java.lang.String, 
      /* level */ chromeDashAppsLib.chromeNs.integer, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when the mute state of the audio input or output changes.
    * Note that mute state is system-wide and the new value applies to
    * every audio device with specified stream type.
    */
  val onMuteChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* streamType */ js.Array[chromeDashAppsLib.chromeNs.audioNs.StreamType], 
      /* isMuted */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.native
  def getDevices(
    callback: js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.audioNs.AudioDeviceInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Gets a list of audio devices filtered based on |filter|.
    */
  def getDevices(
    filter: chromeDashAppsLib.chromeNs.audioNs.Filter,
    callback: js.Function1[
      /* devices */ js.Array[chromeDashAppsLib.chromeNs.audioNs.AudioDeviceInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Gets the system-wide mute state for the specified stream type.
    * @param streamType Stream type for which mute state should be fetched.
    * @param callback Callback reporting whether mute is set or not for specified stream type.
    */
  def getMute(
    streamType: chromeDashAppsLib.chromeNs.audioNs.StreamType,
    callback: js.Function1[/* value */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /** Sets lists of active input and/or output devices. */
  def setDevices(
    ids: js.Array[chromeDashAppsLib.chromeNs.audioNs.DeviceIdLists | java.lang.String],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets mute state for a stream type. The mute state will apply to all audio devices with the specified audio stream type.
    * @param streamType Stream type for which mute state should be set.
    * @param isMuted New mute value.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this: function() {...};
    */
  def setMute(streamType: chromeDashAppsLib.chromeNs.audioNs.StreamType, isMuted: scala.Boolean): scala.Unit = js.native
  def setMute(
    streamType: chromeDashAppsLib.chromeNs.audioNs.StreamType,
    isMuted: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Sets the properties for the input or output device. */
  def setProperties(
    id: java.lang.String,
    properties: chromeDashAppsLib.chromeNs.audioNs.SetDeviceProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

