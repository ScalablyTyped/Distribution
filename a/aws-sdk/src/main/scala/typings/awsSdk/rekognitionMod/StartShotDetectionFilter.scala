package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartShotDetectionFilter extends js.Object {
  
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence level lower than this specified value. If you don't specify MinSegmentConfidence, the GetSegmentDetection returns segments with confidence values greater than or equal to 50 percent.
    */
  var MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.native
}
object StartShotDetectionFilter {
  
  @scala.inline
  def apply(): StartShotDetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartShotDetectionFilter]
  }
  
  @scala.inline
  implicit class StartShotDetectionFilterOps[Self <: StartShotDetectionFilter] (val x: Self) extends AnyVal {
    
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
    def setMinSegmentConfidence(value: SegmentConfidence): Self = this.set("MinSegmentConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSegmentConfidence: Self = this.set("MinSegmentConfidence", js.undefined)
  }
}
