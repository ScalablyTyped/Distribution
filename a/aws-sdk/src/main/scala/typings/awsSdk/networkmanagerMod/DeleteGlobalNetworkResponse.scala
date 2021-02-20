package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetwork] = js.native
}
object DeleteGlobalNetworkResponse {
  
  @scala.inline
  def apply(): DeleteGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalNetworkResponse]
  }
  
  @scala.inline
  implicit class DeleteGlobalNetworkResponseMutableBuilder[Self <: DeleteGlobalNetworkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}
