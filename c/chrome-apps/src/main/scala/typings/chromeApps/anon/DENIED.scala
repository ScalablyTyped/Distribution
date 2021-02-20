package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.denied_
import typings.chromeApps.chromeAppsStrings.granted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DENIED extends StObject {
  
  var DENIED: denied_ = js.native
  
  var GRANTED: granted_ = js.native
}
object DENIED {
  
  @scala.inline
  def apply(DENIED: denied_, GRANTED: granted_): DENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DENIED]
  }
  
  @scala.inline
  implicit class DENIEDMutableBuilder[Self <: DENIED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDENIED(value: denied_): Self = StObject.set(x, "DENIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRANTED(value: granted_): Self = StObject.set(x, "GRANTED", value.asInstanceOf[js.Any])
  }
}
