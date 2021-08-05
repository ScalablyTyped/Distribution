package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: Height
  
  var words: String
}
object Location {
  
  inline def apply(location: Height, words: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLocation(value: Height): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
