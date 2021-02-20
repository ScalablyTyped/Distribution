package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkProfileResult extends StObject {
  
  /**
    * The network profile.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}
object GetNetworkProfileResult {
  
  @scala.inline
  def apply(): GetNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResult]
  }
  
  @scala.inline
  implicit class GetNetworkProfileResultMutableBuilder[Self <: GetNetworkProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}
