package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProposalInput extends StObject {
  
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: ResourceIdString = js.native
  
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: ResourceIdString = js.native
}
object GetProposalInput {
  
  @scala.inline
  def apply(NetworkId: ResourceIdString, ProposalId: ResourceIdString): GetProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProposalInput]
  }
  
  @scala.inline
  implicit class GetProposalInputMutableBuilder[Self <: GetProposalInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
  }
}
