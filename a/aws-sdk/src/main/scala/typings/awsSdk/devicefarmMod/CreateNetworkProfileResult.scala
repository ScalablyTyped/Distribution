package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkProfileResult extends StObject {
  
  /**
    * The network profile that is returned by the create network profile request.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}
object CreateNetworkProfileResult {
  
  @scala.inline
  def apply(): CreateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkProfileResult]
  }
  
  @scala.inline
  implicit class CreateNetworkProfileResultMutableBuilder[Self <: CreateNetworkProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}
