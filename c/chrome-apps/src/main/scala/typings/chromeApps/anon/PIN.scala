package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.PUK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PIN extends StObject {
  
  var PIN: typings.chromeApps.chromeAppsStrings.PIN = js.native
  
  var PUK: typings.chromeApps.chromeAppsStrings.PUK = js.native
}
object PIN {
  
  @scala.inline
  def apply(PIN: typings.chromeApps.chromeAppsStrings.PIN, PUK: PUK): PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
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
