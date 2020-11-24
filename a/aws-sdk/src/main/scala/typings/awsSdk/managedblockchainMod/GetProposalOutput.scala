package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProposalOutput extends js.Object {
  
  /**
    * Information about a proposal.
    */
  var Proposal: js.UndefOr[typings.awsSdk.managedblockchainMod.Proposal] = js.native
}
object GetProposalOutput {
  
  @scala.inline
  def apply(): GetProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProposalOutput]
  }
  
  @scala.inline
  implicit class GetProposalOutputOps[Self <: GetProposalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProposal(value: Proposal): Self = this.set("Proposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposal: Self = this.set("Proposal", js.undefined)
  }
}
