package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisibleBoolean extends StObject {
  
  var isFocusVisible: Boolean
}
object IsFocusVisibleBoolean {
  
  inline def apply(isFocusVisible: Boolean): IsFocusVisibleBoolean = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocusVisibleBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsFocusVisibleBoolean] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
