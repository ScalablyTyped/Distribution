package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecognizeCelebritiesResponse extends js.Object {
  /**
    * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an image.
    */
  var CelebrityFaces: js.UndefOr[CelebrityList] = js.native
  /**
    * The orientation of the input image (counterclockwise direction). If your application displays the image, you can use this value to correct the orientation. The bounding box coordinates returned in CelebrityFaces and UnrecognizedFaces represent face locations before the image orientation is corrected.   If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value of OrientationCorrection is null. The CelebrityFaces and UnrecognizedFaces bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata.  
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.native
  /**
    * Details about each unrecognized face in the image.
    */
  var UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.native
}

object RecognizeCelebritiesResponse {
  @scala.inline
  def apply(): RecognizeCelebritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeCelebritiesResponse]
  }
  @scala.inline
  implicit class RecognizeCelebritiesResponseOps[Self <: RecognizeCelebritiesResponse] (val x: Self) extends AnyVal {
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
    def setCelebrityFacesVarargs(value: Celebrity*): Self = this.set("CelebrityFaces", js.Array(value :_*))
    @scala.inline
    def setCelebrityFaces(value: CelebrityList): Self = this.set("CelebrityFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCelebrityFaces: Self = this.set("CelebrityFaces", js.undefined)
    @scala.inline
    def setOrientationCorrection(value: OrientationCorrection): Self = this.set("OrientationCorrection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationCorrection: Self = this.set("OrientationCorrection", js.undefined)
    @scala.inline
    def setUnrecognizedFacesVarargs(value: ComparedFace*): Self = this.set("UnrecognizedFaces", js.Array(value :_*))
    @scala.inline
    def setUnrecognizedFaces(value: ComparedFaceList): Self = this.set("UnrecognizedFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnrecognizedFaces: Self = this.set("UnrecognizedFaces", js.undefined)
  }
  
}

