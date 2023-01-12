package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelectedOption[Option] extends StObject {
  
  var isSelected: Boolean
  
  var option: Option
}
object IsSelectedOption {
  
  inline def apply[Option](isSelected: Boolean, option: Option): IsSelectedOption[Option] = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOption[Option]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSelectedOption[?], Option] (val x: Self & IsSelectedOption[Option]) extends AnyVal {
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
