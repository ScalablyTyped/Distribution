package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodegroupResponse extends js.Object {
  /**
    * The full description of your new node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}

object CreateNodegroupResponse {
  @scala.inline
  def apply(nodegroup: Nodegroup = null): CreateNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    if (nodegroup != null) __obj.updateDynamic("nodegroup")(nodegroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodegroupResponse]
  }
}

