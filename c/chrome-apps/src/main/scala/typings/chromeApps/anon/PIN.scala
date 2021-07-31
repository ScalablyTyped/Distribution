package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.PUK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PIN extends StObject {
  
  var PIN: typings.chromeApps.chromeAppsStrings.PIN
  
  var PUK: typings.chromeApps.chromeAppsStrings.PUK
}
object PIN {
  
  @scala.inline
  def apply(): PIN = {
    val __obj = js.Dynamic.literal(PIN = "PIN", PUK = "PUK")
    __obj.asInstanceOf[PIN]
  }
  
  @scala.inline
  implicit class PINMutableBuilder[Self <: PIN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPIN(value: typings.chromeApps.chromeAppsStrings.PIN): Self = StObject.set(x, "PIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUK(value: PUK): Self = StObject.set(x, "PUK", value.asInstanceOf[js.Any])
  }
}
