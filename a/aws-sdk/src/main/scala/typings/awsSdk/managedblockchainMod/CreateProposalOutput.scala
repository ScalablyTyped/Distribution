package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProposalOutput extends StObject {
  
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateProposalOutput {
  
  inline def apply(): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProposalOutput]
  }
  
  extension [Self <: CreateProposalOutput](x: Self) {
    
    inline def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "ProposalId", js.undefined)
  }
}
