package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInput extends StObject {
  
  /**
    * The unique identifier of the network to get information about.
    */
  var NetworkId: ResourceIdString
}
object GetNetworkInput {
  
  @scala.inline
  def apply(NetworkId: ResourceIdString): GetNetworkInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInput]
  }
  
  @scala.inline
  implicit class GetNetworkInputMutableBuilder[Self <: GetNetworkInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
