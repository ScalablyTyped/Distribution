package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDetection extends js.Object {
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the detected text and the accuracy of the geometry points around the detected text.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The word or line of text recognized by Amazon Rekognition. 
    */
  var DetectedText: js.UndefOr[String] = js.native
  /**
    * The location of the detected text on the image. Includes an axis aligned coarse bounding box surrounding the text and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typings.awsSdk.rekognitionMod.Geometry] = js.native
  /**
    * The identifier for the detected text. The identifier is only unique for a single call to DetectText. 
    */
  var Id: js.UndefOr[UInteger] = js.native
  /**
    * The Parent identifier for the detected text identified by the value of ID. If the type of detected text is LINE, the value of ParentId is Null. 
    */
  var ParentId: js.UndefOr[UInteger] = js.native
  /**
    * The type of text that was detected.
    */
  var Type: js.UndefOr[TextTypes] = js.native
}

object TextDetection {
  @scala.inline
  def apply(): TextDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetection]
  }
  @scala.inline
  implicit class TextDetectionOps[Self <: TextDetection] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    @scala.inline
    def setDetectedText(value: String): Self = this.set("DetectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedText: Self = this.set("DetectedText", js.undefined)
    @scala.inline
    def setGeometry(value: Geometry): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("Geometry", js.undefined)
    @scala.inline
    def setId(value: UInteger): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setParentId(value: UInteger): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    @scala.inline
    def setType(value: TextTypes): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

