package typings.cordovaPluginIbeacon.mod.global.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginResult extends js.Object {
  
  var authorizationStatus: String = js.native
  
  var beacons: js.Array[Beacon] = js.native
  
  var error: String = js.native
  
  var eventType: String = js.native
  
  var region: Region = js.native
  
  var state: String = js.native
}
object PluginResult {
  
  @scala.inline
  def apply(
    authorizationStatus: String,
    beacons: js.Array[Beacon],
    error: String,
    eventType: String,
    region: Region,
    state: String
  ): PluginResult = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], beacons = beacons.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginResult]
  }
  
  @scala.inline
  implicit class PluginResultOps[Self <: PluginResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationStatus(value: String): Self = this.set("authorizationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: Beacon*): Self = this.set("beacons", js.Array(value :_*))
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
