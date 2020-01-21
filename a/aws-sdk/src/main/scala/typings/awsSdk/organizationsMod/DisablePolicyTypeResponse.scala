package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisablePolicyTypeResponse extends js.Object {
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typings.awsSdk.organizationsMod.Root] = js.native
}

object DisablePolicyTypeResponse {
  @scala.inline
  def apply(Root: Root = null): DisablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisablePolicyTypeResponse]
  }
}

