package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionByArnRequest extends js.Object {
  /**
    * The ARN of the layer version.
    */
  var Arn: LayerVersionArn = js.native
}

object GetLayerVersionByArnRequest {
  @scala.inline
  def apply(Arn: LayerVersionArn): GetLayerVersionByArnRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionByArnRequest]
  }
}

