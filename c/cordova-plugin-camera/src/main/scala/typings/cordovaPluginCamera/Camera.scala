package typings.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin provides an API for taking pictures and for choosing images from the system's image library.
  */
@js.native
trait Camera extends StObject {
  
  /**
    * Removes intermediate photos taken by the camera from temporary storage.
    * @param onSuccess Success callback, that called when cleanup succeeds.
    * @param onError Error callback, that get an error message.
    */
  def cleanup(onSuccess: js.Function0[Unit], onError: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  /**
    * Takes a photo using the camera, or retrieves a photo from the device's image gallery.
    * @param cameraSuccess Success callback, that get the image
    * as a base64-encoded String, or as the URI for the image file.
    * @param cameraError Error callback, that get an error message.
    * @param cameraOptions Optional parameters to customize the camera settings.
    */
  def getPicture(
    cameraSuccess: js.Function1[/* data */ String, Unit],
    cameraError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  def getPicture(
    cameraSuccess: js.Function1[/* data */ String, Unit],
    cameraError: js.Function1[/* message */ String, Unit],
    cameraOptions: CameraOptions
  ): Unit = js.native
}
