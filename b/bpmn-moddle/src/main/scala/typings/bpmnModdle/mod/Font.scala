package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends TypeDerived {
  
  var isBold: Boolean = js.native
  
  var isItalic: Boolean = js.native
  
  var isStrikeThrough: Boolean = js.native
  
  var isUnderline: Boolean = js.native
  
  var name: String = js.native
  
  var size: Double = js.native
}
object Font {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    isBold: Boolean,
    isItalic: Boolean,
    isStrikeThrough: Boolean,
    isUnderline: Boolean,
    name: String,
    size: Double
  ): Font = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isBold = isBold.asInstanceOf[js.Any], isItalic = isItalic.asInstanceOf[js.Any], isStrikeThrough = isStrikeThrough.asInstanceOf[js.Any], isUnderline = isUnderline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsBold(value: Boolean): Self = StObject.set(x, "isBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsItalic(value: Boolean): Self = StObject.set(x, "isItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrikeThrough(value: Boolean): Self = StObject.set(x, "isStrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnderline(value: Boolean): Self = StObject.set(x, "isUnderline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
