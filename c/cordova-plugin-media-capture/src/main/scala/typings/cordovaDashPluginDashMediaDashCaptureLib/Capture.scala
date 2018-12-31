package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This plugin provides access to the device's audio, image, and video capture capabilities. */
@js.native
trait Capture extends js.Object {
  /** The audio recording formats supported by the device. */
  var supportedAudioModes: js.Array[ConfigurationData] = js.native
  /** The recording image sizes and formats supported by the device. */
  var supportedImageModes: js.Array[ConfigurationData] = js.native
  /** The recording video resolutions and formats supported by the device. */
  var supportedVideoModes: js.Array[ConfigurationData] = js.native
  /**
    * Start the audio recorder application and return information about captured audio clip files.
    * @param onSuccess Executes when the capture operation finishes with an array
    *                  of MediaFile objects describing each captured audio clip file.
    * @param onError   Executes, if the user terminates the operation before an audio clip is captured,
    *                  with a CaptureError object, featuring the CaptureError.CAPTURE_NO_MEDIA_FILES error code.
    * @param options   Encapsulates audio capture configuration options.
    */
  def captureAudio(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureAudio(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: AudioOptions
  ): scala.Unit = js.native
  /**
    * Start the camera application and return information about captured image files.
    * @param onSuccess Executes when the capture operation finishes with an array
    *                  of MediaFile objects describing each captured image clip file.
    * @param onError   Executes, if the user terminates the operation before an audio clip is captured,
    *                  with a CaptureError object, featuring the CaptureError.CAPTURE_NO_MEDIA_FILES error code.
    * @param options   Encapsulates audio capture configuration options.
    */
  def captureImage(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureImage(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: ImageOptions
  ): scala.Unit = js.native
  /**
    * Start the video recorder application and return information about captured video clip files.
    * @param onSuccess Executes when the capture operation finishes with an array
    *                  of MediaFile objects describing each captured video clip file.
    * @param onError   Executes, if the user terminates the operation before an audio clip is captured,
    *                  with a CaptureError object, featuring the CaptureError.CAPTURE_NO_MEDIA_FILES error code.
    * @param options   Encapsulates audio capture configuration options.
    */
  def captureVideo(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureVideo(
    onSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    onError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: VideoOptions
  ): scala.Unit = js.native
}

