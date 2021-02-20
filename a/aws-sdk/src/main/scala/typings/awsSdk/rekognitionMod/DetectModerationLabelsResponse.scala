package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectModerationLabelsResponse extends StObject {
  
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopActivationOutput] = js.native
  
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typings.awsSdk.rekognitionMod.ModerationLabels] = js.native
  
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
}
object DetectModerationLabelsResponse {
  
  @scala.inline
  def apply(): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
  
  @scala.inline
  implicit class DetectModerationLabelsResponseMutableBuilder[Self <: DetectModerationLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = StObject.set(x, "HumanLoopActivationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationOutputUndefined: Self = StObject.set(x, "HumanLoopActivationOutput", js.undefined)
    
    @scala.inline
    def setModerationLabels(value: ModerationLabels): Self = StObject.set(x, "ModerationLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationLabelsUndefined: Self = StObject.set(x, "ModerationLabels", js.undefined)
    
    @scala.inline
    def setModerationLabelsVarargs(value: ModerationLabel*): Self = StObject.set(x, "ModerationLabels", js.Array(value :_*))
    
    @scala.inline
    def setModerationModelVersion(value: String): Self = StObject.set(x, "ModerationModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationModelVersionUndefined: Self = StObject.set(x, "ModerationModelVersion", js.undefined)
  }
}
