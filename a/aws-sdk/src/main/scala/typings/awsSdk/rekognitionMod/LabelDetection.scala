package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelDetection extends StObject {
  
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typings.awsSdk.rekognitionMod.Label] = js.native
  
  /**
    * Time, in milliseconds from the start of the video, that the label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}
object LabelDetection {
  
  @scala.inline
  def apply(): LabelDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDetection]
  }
  
  @scala.inline
  implicit class LabelDetectionMutableBuilder[Self <: LabelDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
