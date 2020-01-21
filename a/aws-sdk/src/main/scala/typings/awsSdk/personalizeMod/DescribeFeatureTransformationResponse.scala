package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFeatureTransformationResponse extends js.Object {
  /**
    * A listing of the FeatureTransformation properties.
    */
  var featureTransformation: js.UndefOr[FeatureTransformation] = js.native
}

object DescribeFeatureTransformationResponse {
  @scala.inline
  def apply(featureTransformation: FeatureTransformation = null): DescribeFeatureTransformationResponse = {
    val __obj = js.Dynamic.literal()
    if (featureTransformation != null) __obj.updateDynamic("featureTransformation")(featureTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureTransformationResponse]
  }
}

