package typings.baseui.selectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosizeInputState extends StObject {
  
  var inputWidth: Double = js.native
}
object AutosizeInputState {
  
  @scala.inline
  def apply(inputWidth: Double): AutosizeInputState = {
    val __obj = js.Dynamic.literal(inputWidth = inputWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputState]
  }
  
  @scala.inline
  implicit class AutosizeInputStateMutableBuilder[Self <: AutosizeInputState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
  }
}
