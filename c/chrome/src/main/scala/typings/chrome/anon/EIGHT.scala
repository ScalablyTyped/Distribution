package typings.chrome.anon

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.seven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EIGHT extends StObject {
  
  var EIGHT: eight
  
  var SEVEN: seven
}
object EIGHT {
  
  inline def apply(): EIGHT = {
    val __obj = js.Dynamic.literal(EIGHT = "eight", SEVEN = "seven")
    __obj.asInstanceOf[EIGHT]
  }
  
  extension [Self <: EIGHT](x: Self) {
    
    inline def setEIGHT(value: eight): Self = StObject.set(x, "EIGHT", value.asInstanceOf[js.Any])
    
    inline def setSEVEN(value: seven): Self = StObject.set(x, "SEVEN", value.asInstanceOf[js.Any])
  }
}
