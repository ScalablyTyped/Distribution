package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var color: String = js.native
  
  var unprocessed: String = js.native
}
object Color {
  
  @scala.inline
  def apply(color: String, unprocessed: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessed(value: String): Self = StObject.set(x, "unprocessed", value.asInstanceOf[js.Any])
  }
}
