package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocused extends StObject {
  
  var isFocused: Boolean
}
object IsFocused {
  
  inline def apply(isFocused: Boolean): IsFocused = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocused]
  }
  
  extension [Self <: IsFocused](x: Self) {
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
