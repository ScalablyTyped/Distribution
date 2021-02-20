package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectCustomLabelsRequest extends StObject {
  
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  
  /**
    * Maximum number of results you want the service to return in the response. The service returns the specified number of highest confidence labels ranked from highest confidence to lowest.
    */
  var MaxResults: js.UndefOr[UInteger] = js.native
  
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless of the default thresholds that the model version applies.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  
  /**
    * The ARN of the model version that you want to use.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}
object DetectCustomLabelsRequest {
  
  @scala.inline
  def apply(Image: Image, ProjectVersionArn: ProjectVersionArn): DetectCustomLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectCustomLabelsRequest]
  }
  
  @scala.inline
  implicit class DetectCustomLabelsRequestMutableBuilder[Self <: DetectCustomLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: UInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
