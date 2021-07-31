package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapedTextOpts extends StObject {
  
  var font: SkFont
  
  var leftToRight: Boolean
  
  var text: String
  
  var width: Double
}
object ShapedTextOpts {
  
  @scala.inline
  def apply(font: SkFont, leftToRight: Boolean, text: String, width: Double): ShapedTextOpts = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], leftToRight = leftToRight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedTextOpts]
  }
  
  @scala.inline
  implicit class ShapedTextOptsMutableBuilder[Self <: ShapedTextOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: SkFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftToRight(value: Boolean): Self = StObject.set(x, "leftToRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
