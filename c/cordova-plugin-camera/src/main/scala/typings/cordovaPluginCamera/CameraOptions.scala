package typings.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraOptions extends js.Object {
  
  /** Allow simple editing of image before selection. */
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose the camera to use (front- or back-facing).
    * Defined in navigator.camera.Direction. Default is BACK.
    *      FRONT: 0
    *      BACK: 1
    */
  var cameraDirection: js.UndefOr[Double] = js.native
  
  /** Rotate the image to correct for the orientation of the device during capture. */
  var correctOrientation: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose the format of the return value.
    * Defined in navigator.camera.DestinationType. Default is FILE_URI.
    *      DATA_URL : 0,   Return image as base64-encoded string
    *      FILE_URI : 1,   Return image file URI
    */
  var destinationType: js.UndefOr[Double] = js.native
  
  /**
    * Choose the returned image file's encoding.
    * Defined in navigator.camera.EncodingType. Default is JPEG
    *      JPEG : 0    Return JPEG encoded image
    *      PNG : 1     Return PNG encoded image
    */
  var encodingType: js.UndefOr[Double] = js.native
  
  /**
    * Set the type of media to select from. Only works when PictureSourceType
    * is PHOTOLIBRARY or SAVEDPHOTOALBUM. Defined in nagivator.camera.MediaType
    *      PICTURE: 0      allow selection of still pictures only. DEFAULT.
    *          Will return format specified via DestinationType
    *      VIDEO: 1        allow selection of video only, WILL ALWAYS RETURN FILE_URI
    *      ALLMEDIA : 2    allow selection from all media types
    */
  var mediaType: js.UndefOr[Double] = js.native
  
  /** iOS-only options that specify popover location in iPad. Defined in CameraPopoverOptions. */
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  
  /** Picture quality in range 0-100. Default is 50 */
  var quality: js.UndefOr[Double] = js.native
  
  /** Save the image to the photo album on the device after capture. */
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the source of the picture.
    * Defined in navigator.camera.PictureSourceType. Default is CAMERA.
    *      PHOTOLIBRARY : 0,
    *      CAMERA : 1,
    *      SAVEDPHOTOALBUM : 2
    */
  var sourceType: js.UndefOr[Double] = js.native
  
  /**
    * Height in pixels to scale image. Must be used with targetWidth.
    * Aspect ratio remains constant.
    */
  var targetHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width in pixels to scale image. Must be used with targetHeight.
    * Aspect ratio remains constant.
    */
  var targetWidth: js.UndefOr[Double] = js.native
}
object CameraOptions {
  
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  @scala.inline
  implicit class CameraOptionsOps[Self <: CameraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    
    @scala.inline
    def setCameraDirection(value: Double): Self = this.set("cameraDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraDirection: Self = this.set("cameraDirection", js.undefined)
    
    @scala.inline
    def setCorrectOrientation(value: Boolean): Self = this.set("correctOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrectOrientation: Self = this.set("correctOrientation", js.undefined)
    
    @scala.inline
    def setDestinationType(value: Double): Self = this.set("destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationType: Self = this.set("destinationType", js.undefined)
    
    @scala.inline
    def setEncodingType(value: Double): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodingType: Self = this.set("encodingType", js.undefined)
    
    @scala.inline
    def setMediaType(value: Double): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setPopoverOptions(value: CameraPopoverOptions): Self = this.set("popoverOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverOptions: Self = this.set("popoverOptions", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSaveToPhotoAlbum(value: Boolean): Self = this.set("saveToPhotoAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveToPhotoAlbum: Self = this.set("saveToPhotoAlbum", js.undefined)
    
    @scala.inline
    def setSourceType(value: Double): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setTargetHeight(value: Double): Self = this.set("targetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetHeight: Self = this.set("targetHeight", js.undefined)
    
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWidth: Self = this.set("targetWidth", js.undefined)
  }
}
