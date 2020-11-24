package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDetectionResult extends js.Object {
  
  /**
    * Details about text detected in a video.
    */
  var TextDetection: js.UndefOr[typings.awsSdk.rekognitionMod.TextDetection] = js.native
  
  /**
    * The time, in milliseconds from the start of the video, that the text was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}
object TextDetectionResult {
  
  @scala.inline
  def apply(): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetectionResult]
  }
  
  @scala.inline
  implicit class TextDetectionResultOps[Self <: TextDetectionResult] (val x: Self) extends AnyVal {
    
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
    def setTextDetection(value: TextDetection): Self = this.set("TextDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDetection: Self = this.set("TextDetection", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
