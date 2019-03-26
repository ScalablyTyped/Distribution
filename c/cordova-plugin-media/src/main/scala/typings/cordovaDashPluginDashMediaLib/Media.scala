package typings
package cordovaDashPluginDashMediaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin provides the ability to record and play back audio files on a device.
  * NOTE: The current implementation does not adhere to a W3C specification for media capture,
  * and is provided for convenience only. A future implementation will adhere to the latest
  * W3C specification and may deprecate the current APIs.
  */
@js.native
trait Media extends js.Object {
  /** The duration of the media, in seconds. */
  var duration: scala.Double = js.native
  /**
    * The position within the audio playback, in seconds.
    * Not automatically updated during play; call getCurrentPosition to update.
    */
  var position: scala.Double = js.native
  /**
    * Returns the current position within an audio file. Also updates the Media object's position parameter.
    * @param mediaSuccess The callback that is passed the current position in seconds.
    * @param mediaError   The callback to execute if an error occurs.
    */
  def getCurrentPosition(mediaSuccess: js.Function1[/* position */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getCurrentPosition(
    mediaSuccess: js.Function1[/* position */ scala.Double, scala.Unit],
    mediaError: js.Function1[/* error */ stdLib.MediaError, scala.Unit]
  ): scala.Unit = js.native
  /** Returns the duration of an audio file in seconds. If the duration is unknown, it returns a value of -1. */
  def getDuration(): scala.Double = js.native
  /** Pauses playing an audio file. */
  def pause(): scala.Unit = js.native
  /** 
    * Starts or resumes playing an audio file.
    * @param iosPlayOptions: iOS options quirks
    */
  def play(): scala.Unit = js.native
  def play(iosPlayOptions: IosPlayOptions): scala.Unit = js.native
  /**
    * Releases the underlying operating system's audio resources. This is particularly important
    * for Android, since there are a finite amount of OpenCore instances for media playback.
    * Applications should call the release function for any Media resource that is no longer needed.
    */
  def release(): scala.Unit = js.native
  /**
    * Sets the current position within an audio file.
    * @param position Position in milliseconds.
    */
  def seekTo(position: scala.Double): scala.Unit = js.native
  /**
    * Set the volume for an audio file.
    * @param volume The volume to set for playback. The value must be within the range of 0.0 to 1.0.
    */
  def setVolume(volume: scala.Double): scala.Unit = js.native
  /** Starts recording an audio file. */
  def startRecord(): scala.Unit = js.native
  /** Stops playing an audio file. */
  def stop(): scala.Unit = js.native
  /** Stops recording an audio file. */
  def stopRecord(): scala.Unit = js.native
}

@JSGlobal("Media")
@js.native
class MediaCls protected () extends Media {
  def this(src: java.lang.String, mediaSuccess: js.Function0[scala.Unit]) = this()
  def this(src: java.lang.String, mediaSuccess: js.Function0[scala.Unit], mediaError: js.Function1[/* error */ stdLib.MediaError, _]) = this()
  def this(src: java.lang.String, mediaSuccess: js.Function0[scala.Unit], mediaError: js.Function1[/* error */ stdLib.MediaError, _], mediaStatus: js.Function1[/* status */ scala.Double, scala.Unit]) = this()
}

@JSGlobal("Media")
@js.native
object Media
  extends org.scalablytyped.runtime.Instantiable2[/* src */ java.lang.String, /* mediaSuccess */ js.Function0[scala.Unit], Media]
     with org.scalablytyped.runtime.Instantiable3[
      /* src */ java.lang.String, 
      /* mediaSuccess */ js.Function0[scala.Unit], 
      /* mediaError */ js.Function1[/* error */ stdLib.MediaError, js.Any], 
      Media
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* src */ java.lang.String, 
      /* mediaSuccess */ js.Function0[scala.Unit], 
      /* mediaError */ js.Function1[/* error */ stdLib.MediaError, js.Any], 
      /* mediaStatus */ js.Function1[/* status */ scala.Double, scala.Unit], 
      Media
    ] {
  //Media statuses
  var MEDIA_NONE: scala.Double = js.native
  var MEDIA_PAUSED: scala.Double = js.native
  var MEDIA_RUNNING: scala.Double = js.native
  var MEDIA_STARTING: scala.Double = js.native
  var MEDIA_STOPPED: scala.Double = js.native
}

