package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectCustomLabelsRequest extends StObject {
  
  var Image: typings.awsSdk.rekognitionMod.Image
  
  /**
    * Maximum number of results you want the service to return in the response. The service returns the specified number of highest confidence labels ranked from highest confidence to lowest.
    */
  var MaxResults: js.UndefOr[UInteger] = js.undefined
  
  /**
    * Specifies the minimum confidence level for the labels to return. DetectCustomLabels doesn't return any labels with a confidence value that's lower than this specified value. If you specify a value of 0, DetectCustomLabels returns all labels, regardless of the assumed threshold applied to each label. If you don't specify a value for MinConfidence, DetectCustomLabels returns labels based on the assumed threshold of each label.
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The ARN of the model version that you want to use.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn
}
object DetectCustomLabelsRequest {
  
  inline def apply(Image: Image, ProjectVersionArn: ProjectVersionArn): DetectCustomLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectCustomLabelsRequest]
  }
  
  extension [Self <: DetectCustomLabelsRequest](x: Self) {
    
    inline def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: UInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
