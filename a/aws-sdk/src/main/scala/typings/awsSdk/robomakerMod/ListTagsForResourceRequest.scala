package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The AWS RoboMaker Amazon Resource Name (ARN) with tags to be listed.
    */
  var resourceArn: Arn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

