package typings.chrome.anon

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.seven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EIGHT extends StObject {
  
  var EIGHT: eight = js.native
  
  var SEVEN: seven = js.native
}
object EIGHT {
  
  @scala.inline
  def apply(EIGHT: eight, SEVEN: seven): EIGHT = {
    val __obj = js.Dynamic.literal(EIGHT = EIGHT.asInstanceOf[js.Any], SEVEN = SEVEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIGHT]
  }
  
  @scala.inline
  implicit class EIGHTMutableBuilder[Self <: EIGHT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEIGHT(value: eight): Self = StObject.set(x, "EIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEVEN(value: seven): Self = StObject.set(x, "SEVEN", value.asInstanceOf[js.Any])
  }
}
