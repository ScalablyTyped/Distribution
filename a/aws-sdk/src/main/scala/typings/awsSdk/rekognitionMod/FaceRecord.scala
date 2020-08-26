package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceRecord extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[typings.awsSdk.rekognitionMod.Face] = js.native
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[typings.awsSdk.rekognitionMod.FaceDetail] = js.native
}

object FaceRecord {
  @scala.inline
  def apply(): FaceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceRecord]
  }
  @scala.inline
  implicit class FaceRecordOps[Self <: FaceRecord] (val x: Self) extends AnyVal {
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
    def setFace(value: Face): Self = this.set("Face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    @scala.inline
    def setFaceDetail(value: FaceDetail): Self = this.set("FaceDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceDetail: Self = this.set("FaceDetail", js.undefined)
  }
  
}

