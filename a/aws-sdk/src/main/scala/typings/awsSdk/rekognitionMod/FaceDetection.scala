package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetection extends js.Object {
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * Time, in milliseconds from the start of the video, that the face was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object FaceDetection {
  @scala.inline
  def apply(): FaceDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetection]
  }
  @scala.inline
  implicit class FaceDetectionOps[Self <: FaceDetection] (val x: Self) extends AnyVal {
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
    def setFace(value: FaceDetail): Self = this.set("Face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

