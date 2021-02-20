package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectModerationLabelsRequest extends StObject {
  
  /**
    * Sets up the configuration for human evaluation, including the FlowDefinition the image will be sent to.
    */
  var HumanLoopConfig: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopConfig] = js.native
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
}
object DetectModerationLabelsRequest {
  
  @scala.inline
  def apply(Image: Image): DetectModerationLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectModerationLabelsRequest]
  }
  
  @scala.inline
  implicit class DetectModerationLabelsRequestMutableBuilder[Self <: DetectModerationLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopConfig(value: HumanLoopConfig): Self = StObject.set(x, "HumanLoopConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopConfigUndefined: Self = StObject.set(x, "HumanLoopConfig", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
  }
}
