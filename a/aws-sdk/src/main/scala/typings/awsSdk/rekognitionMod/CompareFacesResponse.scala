package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareFacesResponse extends js.Object {
  /**
    * An array of faces in the target image that match the source image face. Each CompareFacesMatch object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity score for the face in the bounding box and the face in the source image.
    */
  var FaceMatches: js.UndefOr[CompareFacesMatchList] = js.native
  /**
    * The face in the source image that was used for comparison.
    */
  var SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.native
  /**
    * The value of SourceImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.native
  /**
    * The value of TargetImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.native
  /**
    * An array of faces in the target image that did not match the source image face.
    */
  var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.native
}

object CompareFacesResponse {
  @scala.inline
  def apply(): CompareFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesResponse]
  }
  @scala.inline
  implicit class CompareFacesResponseOps[Self <: CompareFacesResponse] (val x: Self) extends AnyVal {
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
    def setFaceMatchesVarargs(value: CompareFacesMatch*): Self = this.set("FaceMatches", js.Array(value :_*))
    @scala.inline
    def setFaceMatches(value: CompareFacesMatchList): Self = this.set("FaceMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceMatches: Self = this.set("FaceMatches", js.undefined)
    @scala.inline
    def setSourceImageFace(value: ComparedSourceImageFace): Self = this.set("SourceImageFace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceImageFace: Self = this.set("SourceImageFace", js.undefined)
    @scala.inline
    def setSourceImageOrientationCorrection(value: OrientationCorrection): Self = this.set("SourceImageOrientationCorrection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceImageOrientationCorrection: Self = this.set("SourceImageOrientationCorrection", js.undefined)
    @scala.inline
    def setTargetImageOrientationCorrection(value: OrientationCorrection): Self = this.set("TargetImageOrientationCorrection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetImageOrientationCorrection: Self = this.set("TargetImageOrientationCorrection", js.undefined)
    @scala.inline
    def setUnmatchedFacesVarargs(value: ComparedFace*): Self = this.set("UnmatchedFaces", js.Array(value :_*))
    @scala.inline
    def setUnmatchedFaces(value: CompareFacesUnmatchList): Self = this.set("UnmatchedFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmatchedFaces: Self = this.set("UnmatchedFaces", js.undefined)
  }
  
}

