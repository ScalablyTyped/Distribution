package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalNetworkRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
}
object DeleteGlobalNetworkRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String): DeleteGlobalNetworkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalNetworkRequest]
  }
  
  @scala.inline
  implicit class DeleteGlobalNetworkRequestMutableBuilder[Self <: DeleteGlobalNetworkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
