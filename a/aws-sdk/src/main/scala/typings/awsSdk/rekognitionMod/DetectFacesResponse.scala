package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectFacesResponse extends js.Object {
  /**
    * Details of each face found in the image. 
    */
  var FaceDetails: js.UndefOr[FaceDetailList] = js.native
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.native
}

object DetectFacesResponse {
  @scala.inline
  def apply(): DetectFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectFacesResponse]
  }
  @scala.inline
  implicit class DetectFacesResponseOps[Self <: DetectFacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFaceDetailsVarargs(value: FaceDetail*): Self = this.set("FaceDetails", js.Array(value :_*))
    @scala.inline
    def setFaceDetails(value: FaceDetailList): Self = this.set("FaceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceDetails: Self = this.set("FaceDetails", js.undefined)
    @scala.inline
    def setOrientationCorrection(value: OrientationCorrection): Self = this.set("OrientationCorrection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationCorrection: Self = this.set("OrientationCorrection", js.undefined)
  }
  
}

