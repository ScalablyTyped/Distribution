package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransformJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsSdk.sagemakerMod.TransformJobArn = js.native
}

object CreateTransformJobResponse {
  @scala.inline
  def apply(TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
    val __obj = js.Dynamic.literal(TransformJobArn = TransformJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobResponse]
  }
}

