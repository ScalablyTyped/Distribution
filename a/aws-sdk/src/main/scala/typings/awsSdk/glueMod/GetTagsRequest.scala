package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource for which to retrieve tags.
    */
  var ResourceArn: GlueResourceArn = js.native
}

object GetTagsRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTagsRequest]
  }
}

