package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.ResourceARN] = js.native
}

object AddTagsToResourceOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
}

