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
  
  extension [Self <: IsFocusVisibleBoolean](x: Self) {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
