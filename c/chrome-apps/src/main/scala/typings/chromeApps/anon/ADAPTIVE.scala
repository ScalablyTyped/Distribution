package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.adaptive_
import typings.chromeApps.chromeAppsStrings.asynchronous_
import typings.chromeApps.chromeAppsStrings.synchronous_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADAPTIVE extends StObject {
  
  var ADAPTIVE: adaptive_ = js.native
  
  var ASYNCHRONOUS: asynchronous_ = js.native
  
  var SYNCHRONOUS: synchronous_ = js.native
}
object ADAPTIVE {
  
  @scala.inline
  def apply(ADAPTIVE: adaptive_, ASYNCHRONOUS: asynchronous_, SYNCHRONOUS: synchronous_): ADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = ADAPTIVE.asInstanceOf[js.Any], ASYNCHRONOUS = ASYNCHRONOUS.asInstanceOf[js.Any], SYNCHRONOUS = SYNCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADAPTIVE]
  }
  
  @scala.inline
  implicit class ADAPTIVEMutableBuilder[Self <: ADAPTIVE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADAPTIVE(value: adaptive_): Self = StObject.set(x, "ADAPTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASYNCHRONOUS(value: asynchronous_): Self = StObject.set(x, "ASYNCHRONOUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYNCHRONOUS(value: synchronous_): Self = StObject.set(x, "SYNCHRONOUS", value.asInstanceOf[js.Any])
  }
}
