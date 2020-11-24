package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkProfileResult extends js.Object {
  
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
  implicit class CreateNetworkProfileResultOps[Self <: CreateNetworkProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = this.set("networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfile: Self = this.set("networkProfile", js.undefined)
  }
}
