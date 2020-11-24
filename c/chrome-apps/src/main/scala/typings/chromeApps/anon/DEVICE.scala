package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEVICE extends js.Object {
  
  var DEVICE: device__ = js.native
  
  var ENDPOINT: endpoint_ = js.native
  
  var INTERFACE: interface_ = js.native
  
  var OTHER: other_ = js.native
}
object DEVICE {
  
  @scala.inline
  def apply(DEVICE: device__, ENDPOINT: endpoint_, INTERFACE: interface_, OTHER: other_): DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEVICE]
  }
  
  @scala.inline
  implicit class DEVICEOps[Self <: DEVICE] (val x: Self) extends AnyVal {
    
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
    def setDEVICE(value: device__): Self = this.set("DEVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENDPOINT(value: endpoint_): Self = this.set("ENDPOINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERFACE(value: interface_): Self = this.set("INTERFACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: other_): Self = this.set("OTHER", value.asInstanceOf[js.Any])
  }
}
