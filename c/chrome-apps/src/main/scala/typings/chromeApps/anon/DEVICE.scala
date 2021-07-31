package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEVICE extends StObject {
  
  var DEVICE: device__
  
  var ENDPOINT: endpoint_
  
  var INTERFACE: interface_
  
  var OTHER: other_
}
object DEVICE {
  
  @scala.inline
  def apply(): DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = "device", ENDPOINT = "endpoint", INTERFACE = "interface", OTHER = "other")
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
