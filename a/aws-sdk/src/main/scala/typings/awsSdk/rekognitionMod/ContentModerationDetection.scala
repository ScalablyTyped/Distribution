package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentModerationDetection extends StObject {
  
  /**
    * The unsafe content label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsSdk.rekognitionMod.ModerationLabel] = js.native
  
  /**
    * Time, in milliseconds from the beginning of the video, that the unsafe content label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}
object ContentModerationDetection {
  
  @scala.inline
  def apply(): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentModerationDetection]
  }
  
  @scala.inline
  implicit class ContentModerationDetectionMutableBuilder[Self <: ContentModerationDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModerationLabel(value: ModerationLabel): Self = StObject.set(x, "ModerationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationLabelUndefined: Self = StObject.set(x, "ModerationLabel", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
