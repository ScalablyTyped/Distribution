package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var Resource: FunctionArn = js.native
  /**
    * A list of tags to apply to the function.
    */
  var Tags: typings.awsSdk.lambdaMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(Resource: FunctionArn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

