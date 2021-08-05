package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProposalOutput extends StObject {
  
  /**
    * Information about a proposal.
    */
  var Proposal: js.UndefOr[typings.awsSdk.managedblockchainMod.Proposal] = js.undefined
}
object GetProposalOutput {
  
  inline def apply(): GetProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProposalOutput]
  }
  
  extension [Self <: GetProposalOutput](x: Self) {
    
    inline def setProposal(value: Proposal): Self = StObject.set(x, "Proposal", value.asInstanceOf[js.Any])
    
    inline def setProposalUndefined: Self = StObject.set(x, "Proposal", js.undefined)
  }
}
