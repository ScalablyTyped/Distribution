package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompareFacesRequest extends js.Object {
  
  /**
    * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't compared. If you specify AUTO, Amazon Rekognition chooses the quality bar. If you specify LOW, MEDIUM, or HIGH, filtering removes all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you specify NONE, no filtering is performed. The default value is NONE.  To use quality filtering, the collection you are using must be associated with version 3 of the face model or higher.
    */
  var QualityFilter: js.UndefOr[typings.awsSdk.rekognitionMod.QualityFilter] = js.native
  
  /**
    * The minimum level of confidence in the face matches that a match must meet to be included in the FaceMatches array.
    */
  var SimilarityThreshold: js.UndefOr[Percent] = js.native
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var SourceImage: Image = js.native
  
  /**
    * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var TargetImage: Image = js.native
}
object CompareFacesRequest {
  
  @scala.inline
  def apply(SourceImage: Image, TargetImage: Image): CompareFacesRequest = {
    val __obj = js.Dynamic.literal(SourceImage = SourceImage.asInstanceOf[js.Any], TargetImage = TargetImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareFacesRequest]
  }
  
  @scala.inline
  implicit class CompareFacesRequestOps[Self <: CompareFacesRequest] (val x: Self) extends AnyVal {
    
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
    def setSourceImage(value: Image): Self = this.set("SourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetImage(value: Image): Self = this.set("TargetImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityFilter(value: QualityFilter): Self = this.set("QualityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityFilter: Self = this.set("QualityFilter", js.undefined)
    
    @scala.inline
    def setSimilarityThreshold(value: Percent): Self = this.set("SimilarityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimilarityThreshold: Self = this.set("SimilarityThreshold", js.undefined)
  }
}
