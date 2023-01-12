package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.adaptive_
import typings.chromeApps.chromeAppsStrings.asynchronous_
import typings.chromeApps.chromeAppsStrings.synchronous_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADAPTIVE extends StObject {
  
  var ADAPTIVE: adaptive_
  
  var ASYNCHRONOUS: asynchronous_
  
  var SYNCHRONOUS: synchronous_
}
object ADAPTIVE {
  
  inline def apply(): ADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = "adaptive", ASYNCHRONOUS = "asynchronous", SYNCHRONOUS = "synchronous")
    __obj.asInstanceOf[ADAPTIVE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ADAPTIVE] (val x: Self) extends AnyVal {
    
    inline def setADAPTIVE(value: adaptive_): Self = StObject.set(x, "ADAPTIVE", value.asInstanceOf[js.Any])
    
    inline def setASYNCHRONOUS(value: asynchronous_): Self = StObject.set(x, "ASYNCHRONOUS", value.asInstanceOf[js.Any])
    
    inline def setSYNCHRONOUS(value: synchronous_): Self = StObject.set(x, "SYNCHRONOUS", value.asInstanceOf[js.Any])
  }
}
