package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.failure_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONNECTEDFAILURE extends StObject {
  
  var CONNECTED: connected__ = js.native
  
  var FAILURE: failure_ = js.native
}
object CONNECTEDFAILURE {
  
  @scala.inline
  def apply(CONNECTED: connected__, FAILURE: failure_): CONNECTEDFAILURE = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], FAILURE = FAILURE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONNECTEDFAILURE]
  }
  
  @scala.inline
  implicit class CONNECTEDFAILUREMutableBuilder[Self <: CONNECTEDFAILURE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONNECTED(value: connected__): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAILURE(value: failure_): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
  }
}
