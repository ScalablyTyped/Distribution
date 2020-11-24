package typings.cordovaPluginMedia

import typings.std.MediaError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin provides the ability to record and play back audio files on a device.
  * NOTE: The current implementation does not adhere to a W3C specification for media capture,
  * and is provided for convenience only. A future implementation will adhere to the latest
  * W3C specification and may deprecate the current APIs.
  */
@js.native
trait Media extends js.Object {
  
  /** The duration of the media, in seconds. */
  var duration: Double = js.native
  
  /**
    * Returns the current position within an audio file. Also updates the Media object's position parameter.
    * @param mediaSuccess The callback that is passed the current position in seconds.
    * @param mediaError   The callback to execute if an error occurs.
    */
  def getCurrentPosition(mediaSuccess: js.Function1[/* position */ Double, Unit]): Unit = js.native
  def getCurrentPosition(
    mediaSuccess: js.Function1[/* position */ Double, Unit],
    mediaError: js.Function1[/* error */ MediaError, Unit]
  ): Unit = js.native
  
  /** Returns the duration of an audio file in seconds. If the duration is unknown, it returns a value of -1. */
  def getDuration(): Double = js.native
  
  /** Pauses playing an audio file. */
  def pause(): Unit = js.native
  
  /** 
    * Starts or resumes playing an audio file.
    * @param iosPlayOptions: iOS options quirks
    */
  def play(): Unit = js.native
  def play(iosPlayOptions: IosPlayOptions): Unit = js.native
  
  /**
    * The position within the audio playback, in seconds.
    * Not automatically updated during play; call getCurrentPosition to update.
    */
  var position: Double = js.native
  
  /**
    * Releases the underlying operating system's audio resources. This is particularly important
    * for Android, since there are a finite amount of OpenCore instances for media playback.
    * Applications should call the release function for any Media resource that is no longer needed.
    */
  def release(): Unit = js.native
  
  /**
    * Sets the current position within an audio file.
    * @param position Position in milliseconds.
    */
  def seekTo(position: Double): Unit = js.native
  
  /**
    * Set the volume for an audio file.
    * @param volume The volume to set for playback. The value must be within the range of 0.0 to 1.0.
    */
  def setVolume(volume: Double): Unit = js.native
  
  /** Starts recording an audio file. */
  def startRecord(): Unit = js.native
  
  /** Stops playing an audio file. */
  def stop(): Unit = js.native
  
  /** Stops recording an audio file. */
  def stopRecord(): Unit = js.native
}
