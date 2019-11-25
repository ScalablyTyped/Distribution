package typings.cordovaDashPluginDashCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraOptions extends js.Object {
  /** Allow simple editing of image before selection. */
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose the camera to use (front- or back-facing).
    * Defined in navigator.camera.Direction. Default is BACK.
    *      FRONT: 0
    *      BACK: 1
    */
  var cameraDirection: js.UndefOr[Double] = js.undefined
  /** Rotate the image to correct for the orientation of the device during capture. */
  var correctOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose the format of the return value.
    * Defined in navigator.camera.DestinationType. Default is FILE_URI.
    *      DATA_URL : 0,   Return image as base64-encoded string
    *      FILE_URI : 1,   Return image file URI
    *      NATIVE_URI : 2  Return image native URI
    *          (e.g., assets-library:// on iOS or content:// on Android)
    */
  var destinationType: js.UndefOr[Double] = js.undefined
  /**
    * Choose the returned image file's encoding.
    * Defined in navigator.camera.EncodingType. Default is JPEG
    *      JPEG : 0    Return JPEG encoded image
    *      PNG : 1     Return PNG encoded image
    */
  var encodingType: js.UndefOr[Double] = js.undefined
  /**
    * Set the type of media to select from. Only works when PictureSourceType
    * is PHOTOLIBRARY or SAVEDPHOTOALBUM. Defined in nagivator.camera.MediaType
    *      PICTURE: 0      allow selection of still pictures only. DEFAULT.
    *          Will return format specified via DestinationType
    *      VIDEO: 1        allow selection of video only, WILL ALWAYS RETURN FILE_URI
    *      ALLMEDIA : 2    allow selection from all media types
    */
  var mediaType: js.UndefOr[Double] = js.undefined
  /** iOS-only options that specify popover location in iPad. Defined in CameraPopoverOptions. */
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.undefined
  /** Picture quality in range 0-100. Default is 50 */
  var quality: js.UndefOr[Double] = js.undefined
  /** Save the image to the photo album on the device after capture. */
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the source of the picture.
    * Defined in navigator.camera.PictureSourceType. Default is CAMERA.
    *      PHOTOLIBRARY : 0,
    *      CAMERA : 1,
    *      SAVEDPHOTOALBUM : 2
    */
  var sourceType: js.UndefOr[Double] = js.undefined
  /**
    * Height in pixels to scale image. Must be used with targetWidth.
    * Aspect ratio remains constant.
    */
  var targetHeight: js.UndefOr[Double] = js.undefined
  /**
    * Width in pixels to scale image. Must be used with targetHeight.
    * Aspect ratio remains constant.
    */
  var targetWidth: js.UndefOr[Double] = js.undefined
}

object CameraOptions {
  @scala.inline
  def apply(
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    cameraDirection: Int | Double = null,
    correctOrientation: js.UndefOr[Boolean] = js.undefined,
    destinationType: Int | Double = null,
    encodingType: Int | Double = null,
    mediaType: Int | Double = null,
    popoverOptions: CameraPopoverOptions = null,
    quality: Int | Double = null,
    saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined,
    sourceType: Int | Double = null,
    targetHeight: Int | Double = null,
    targetWidth: Int | Double = null
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.asInstanceOf[js.Any])
    if (cameraDirection != null) __obj.updateDynamic("cameraDirection")(cameraDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(correctOrientation)) __obj.updateDynamic("correctOrientation")(correctOrientation.asInstanceOf[js.Any])
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (popoverOptions != null) __obj.updateDynamic("popoverOptions")(popoverOptions.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToPhotoAlbum)) __obj.updateDynamic("saveToPhotoAlbum")(saveToPhotoAlbum.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (targetHeight != null) __obj.updateDynamic("targetHeight")(targetHeight.asInstanceOf[js.Any])
    if (targetWidth != null) __obj.updateDynamic("targetWidth")(targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

