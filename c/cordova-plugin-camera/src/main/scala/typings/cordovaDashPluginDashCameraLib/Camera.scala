package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * This plugin provides an API for taking pictures and for choosing images from the system's image library.
 */
@js.native
trait Camera extends js.Object {
  /**
       * Removes intermediate photos taken by the camera from temporary storage.
       * @param onSuccess Success callback, that called when cleanup succeeds.
       * @param onError Error callback, that get an error message.
       */
  def cleanup(
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Takes a photo using the camera, or retrieves a photo from the device's image gallery.
       * @param cameraSuccess Success callback, that get the image
       * as a base64-encoded String, or as the URI for the image file.
       * @param cameraError Error callback, that get an error message.
       * @param cameraOptions Optional parameters to customize the camera settings.
       */
  def getPicture(
    cameraSuccess: js.Function1[/* data */ java.lang.String, scala.Unit],
    cameraError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Takes a photo using the camera, or retrieves a photo from the device's image gallery.
       * @param cameraSuccess Success callback, that get the image
       * as a base64-encoded String, or as the URI for the image file.
       * @param cameraError Error callback, that get an error message.
       * @param cameraOptions Optional parameters to customize the camera settings.
       */
  def getPicture(
    cameraSuccess: js.Function1[/* data */ java.lang.String, scala.Unit],
    cameraError: js.Function1[/* message */ java.lang.String, scala.Unit],
    cameraOptions: CameraOptions
  ): scala.Unit = js.native
}

@JSGlobal("Camera")
@js.native
object Camera extends js.Object {
  // Camera constants, defined in Camera plugin
  var DestinationType: cordovaDashPluginDashCameraLib.Anon_FILEURI = js.native
  var Direction: cordovaDashPluginDashCameraLib.Anon_FRONT = js.native
  var EncodingType: cordovaDashPluginDashCameraLib.Anon_JPEG = js.native
  var MediaType: cordovaDashPluginDashCameraLib.Anon_PICTURE = js.native
  var PictureSourceType: cordovaDashPluginDashCameraLib.Anon_CAMERA = js.native
  // Used only on iOS
  var PopoverArrowDirection: cordovaDashPluginDashCameraLib.Anon_ARROWRIGHT = js.native
}

