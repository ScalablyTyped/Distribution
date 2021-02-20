package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberInput extends StObject {
  
  /**
    * The unique identifier of the member.
    */
  var MemberId: ResourceIdString = js.native
  
  /**
    * The unique identifier of the network to which the member belongs.
    */
  var NetworkId: ResourceIdString = js.native
}
object GetMemberInput {
  
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): GetMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberInput]
  }
  
  @scala.inline
  implicit class GetMemberInputMutableBuilder[Self <: GetMemberInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
