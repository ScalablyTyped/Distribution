package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeOutput extends js.Object {
  /**
    * Properties of the node configuration.
    */
  var Node: js.UndefOr[typings.awsSdk.managedblockchainMod.Node] = js.native
}

object GetNodeOutput {
  @scala.inline
  def apply(Node: Node = null): GetNodeOutput = {
    val __obj = js.Dynamic.literal()
    if (Node != null) __obj.updateDynamic("Node")(Node.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeOutput]
  }
}

