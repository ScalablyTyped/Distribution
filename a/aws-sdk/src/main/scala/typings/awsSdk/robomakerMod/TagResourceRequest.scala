package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS RoboMaker resource you are tagging.
    */
  var resourceArn: Arn = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the resource.
    */
  var tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

