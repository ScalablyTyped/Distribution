package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNetworkProfileResult extends js.Object {
  
  /**
    * A list of the available network profiles.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}
object UpdateNetworkProfileResult {
  
  @scala.inline
  def apply(): UpdateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNetworkProfileResult]
  }
  
  @scala.inline
  implicit class UpdateNetworkProfileResultOps[Self <: UpdateNetworkProfileResult] (val x: Self) extends AnyVal {
    
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
