package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEVICE extends StObject {
  
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
  implicit class DEVICEMutableBuilder[Self <: DEVICE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEVICE(value: device__): Self = StObject.set(x, "DEVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENDPOINT(value: endpoint_): Self = StObject.set(x, "ENDPOINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERFACE(value: interface_): Self = StObject.set(x, "INTERFACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: other_): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
  }
}
