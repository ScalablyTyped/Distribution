package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectTextResponse extends js.Object {
  
  /**
    * An array of text that was detected in the input image.
    */
  var TextDetections: js.UndefOr[TextDetectionList] = js.native
  
  /**
    * The model version used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
}
object DetectTextResponse {
  
  @scala.inline
  def apply(): DetectTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextResponse]
  }
  
  @scala.inline
  implicit class DetectTextResponseOps[Self <: DetectTextResponse] (val x: Self) extends AnyVal {
    
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
    def setTextDetectionsVarargs(value: TextDetection*): Self = this.set("TextDetections", js.Array(value :_*))
    
    @scala.inline
    def setTextDetections(value: TextDetectionList): Self = this.set("TextDetections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDetections: Self = this.set("TextDetections", js.undefined)
    
    @scala.inline
    def setTextModelVersion(value: String): Self = this.set("TextModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextModelVersion: Self = this.set("TextModelVersion", js.undefined)
  }
}
