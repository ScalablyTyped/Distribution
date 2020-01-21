package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProposalOutput extends js.Object {
  /**
    * Information about a proposal.
    */
  var Proposal: js.UndefOr[typings.awsSdk.managedblockchainMod.Proposal] = js.native
}

object GetProposalOutput {
  @scala.inline
  def apply(Proposal: Proposal = null): GetProposalOutput = {
    val __obj = js.Dynamic.literal()
    if (Proposal != null) __obj.updateDynamic("Proposal")(Proposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProposalOutput]
  }
}

