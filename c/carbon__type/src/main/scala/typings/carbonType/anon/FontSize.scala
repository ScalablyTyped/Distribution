package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSize extends StObject {
  
  var fontSize: String = js.native
}
object FontSize {
  
  @scala.inline
  def apply(fontSize: String): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
  
  @scala.inline
  implicit class FontSizeMutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
