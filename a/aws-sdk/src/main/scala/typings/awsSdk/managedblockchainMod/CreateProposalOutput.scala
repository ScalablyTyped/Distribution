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
  
  @scala.inline
  def apply(): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProposalOutput]
  }
  
  @scala.inline
  implicit class CreateProposalOutputMutableBuilder[Self <: CreateProposalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "ProposalId", js.undefined)
  }
}
