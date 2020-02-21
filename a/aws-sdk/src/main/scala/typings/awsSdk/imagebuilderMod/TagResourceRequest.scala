package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the resource that you want to tag. 
    */
  var resourceArn: ImageBuilderArn = js.native
  /**
    *  The tags to apply to the resource. 
    */
  var tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ImageBuilderArn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

