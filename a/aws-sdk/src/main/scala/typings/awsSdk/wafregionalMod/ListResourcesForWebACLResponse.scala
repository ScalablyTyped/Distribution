package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLResponse extends js.Object {
  /**
    * An array of ARNs (Amazon Resource Names) of the resources associated with the specified web ACL. An array with zero elements is returned if there are no resources associated with the web ACL.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.wafregionalMod.ResourceArns] = js.native
}

object ListResourcesForWebACLResponse {
  @scala.inline
  def apply(ResourceArns: ResourceArns = null): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceArns != null) __obj.updateDynamic("ResourceArns")(ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
}

