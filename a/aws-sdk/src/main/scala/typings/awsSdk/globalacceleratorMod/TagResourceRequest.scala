package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Global Accelerator resource to add tags to. An ARN uniquely identifies a resource.
    */
  var ResourceArn: typings.awsSdk.globalacceleratorMod.ResourceArn = js.native
  /**
    * The tags to add to a resource. A tag consists of a key and a value that you define.
    */
  var Tags: typings.awsSdk.globalacceleratorMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

