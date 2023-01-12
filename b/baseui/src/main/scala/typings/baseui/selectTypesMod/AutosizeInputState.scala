package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosizeInputState extends StObject {
  
  var inputWidth: Double
}
object AutosizeInputState {
  
  inline def apply(inputWidth: Double): AutosizeInputState = {
    val __obj = js.Dynamic.literal(inputWidth = inputWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutosizeInputState] (val x: Self) extends AnyVal {
    
    inline def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
  }
}
