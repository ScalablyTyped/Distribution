package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProposalOutput extends js.Object {
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
}

object CreateProposalOutput {
  @scala.inline
  def apply(ProposalId: ResourceIdString = null): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    if (ProposalId != null) __obj.updateDynamic("ProposalId")(ProposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProposalOutput]
  }
}

