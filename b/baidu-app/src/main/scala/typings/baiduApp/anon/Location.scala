package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var location: Height = js.native
  
  var words: String = js.native
}
object Location {
  
  @scala.inline
  def apply(location: Height, words: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Height): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
