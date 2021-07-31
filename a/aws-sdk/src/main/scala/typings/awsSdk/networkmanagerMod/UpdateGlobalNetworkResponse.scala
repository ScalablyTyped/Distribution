package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetwork] = js.undefined
}
object UpdateGlobalNetworkResponse {
  
  @scala.inline
  def apply(): UpdateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalNetworkResponse]
  }
  
  @scala.inline
  implicit class UpdateGlobalNetworkResponseMutableBuilder[Self <: UpdateGlobalNetworkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}
