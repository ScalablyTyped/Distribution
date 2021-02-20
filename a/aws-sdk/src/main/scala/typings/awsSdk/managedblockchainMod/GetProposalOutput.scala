package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProposalOutput extends StObject {
  
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
  implicit class GetProposalOutputMutableBuilder[Self <: GetProposalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposal(value: Proposal): Self = StObject.set(x, "Proposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalUndefined: Self = StObject.set(x, "Proposal", js.undefined)
  }
}
