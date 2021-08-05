package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.failure_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONNECTEDFAILURE extends StObject {
  
  var CONNECTED: connected__
  
  var FAILURE: failure_
}
object CONNECTEDFAILURE {
  
  inline def apply(): CONNECTEDFAILURE = {
    val __obj = js.Dynamic.literal(CONNECTED = "connected", FAILURE = "failure")
    __obj.asInstanceOf[CONNECTEDFAILURE]
  }
  
  extension [Self <: CONNECTEDFAILURE](x: Self) {
    
    inline def setCONNECTED(value: connected__): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    inline def setFAILURE(value: failure_): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
  }
}
