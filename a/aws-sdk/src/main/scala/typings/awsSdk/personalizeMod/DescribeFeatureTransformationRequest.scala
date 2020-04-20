package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFeatureTransformationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the feature transformation to describe.
    */
  var featureTransformationArn: Arn = js.native
}

object DescribeFeatureTransformationRequest {
  @scala.inline
  def apply(featureTransformationArn: Arn): DescribeFeatureTransformationRequest = {
    val __obj = js.Dynamic.literal(featureTransformationArn = featureTransformationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureTransformationRequest]
  }
}

