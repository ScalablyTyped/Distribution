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
  @scala.inline
  implicit class DescribeFeatureTransformationRequestOps[Self <: DescribeFeatureTransformationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeatureTransformationArn(value: Arn): Self = this.set("featureTransformationArn", value.asInstanceOf[js.Any])
  }
  
}

