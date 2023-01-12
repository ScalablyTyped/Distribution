package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font
  extends StObject
     with TypeDerived {
  
  var isBold: Boolean
  
  var isItalic: Boolean
  
  var isStrikeThrough: Boolean
  
  var isUnderline: Boolean
  
  var name: String
  
  var size: Double
}
object Font {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setIsBold(value: Boolean): Self = StObject.set(x, "isBold", value.asInstanceOf[js.Any])
    
    inline def setIsItalic(value: Boolean): Self = StObject.set(x, "isItalic", value.asInstanceOf[js.Any])
    
    inline def setIsStrikeThrough(value: Boolean): Self = StObject.set(x, "isStrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setIsUnderline(value: Boolean): Self = StObject.set(x, "isUnderline", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
