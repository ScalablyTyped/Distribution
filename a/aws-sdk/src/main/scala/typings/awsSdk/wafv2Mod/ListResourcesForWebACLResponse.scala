package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLResponse extends js.Object {
  /**
    * The array of Amazon Resource Names (ARNs) of the associated resources.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.wafv2Mod.ResourceArns] = js.native
}

object ListResourcesForWebACLResponse {
  @scala.inline
  def apply(ResourceArns: ResourceArns = null): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceArns != null) __obj.updateDynamic("ResourceArns")(ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
}

