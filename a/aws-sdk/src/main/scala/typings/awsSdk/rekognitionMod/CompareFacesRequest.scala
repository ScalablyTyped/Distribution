package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    SourceImage: Image,
    TargetImage: Image,
    QualityFilter: QualityFilter = null,
    SimilarityThreshold: Int | Double = null
  ): CompareFacesRequest = {
    val __obj = js.Dynamic.literal(SourceImage = SourceImage.asInstanceOf[js.Any], TargetImage = TargetImage.asInstanceOf[js.Any])
    if (QualityFilter != null) __obj.updateDynamic("QualityFilter")(QualityFilter.asInstanceOf[js.Any])
    if (SimilarityThreshold != null) __obj.updateDynamic("SimilarityThreshold")(SimilarityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareFacesRequest]
  }
}

