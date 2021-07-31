package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMemberInput extends StObject {
  
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the network from which the member is removed.
    */
  var NetworkId: ResourceIdString
}
object DeleteMemberInput {
  
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): DeleteMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMemberInput]
  }
  
  @scala.inline
  implicit class DeleteMemberInputMutableBuilder[Self <: DeleteMemberInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
