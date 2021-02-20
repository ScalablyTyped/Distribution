package typings.baseui.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedInputProps extends InputProps {
  
  var mask: js.UndefOr[String] = js.native
  
  var maskChar: js.UndefOr[String] = js.native
}
object MaskedInputProps {
  
  @scala.inline
  def apply(): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedInputProps]
  }
  
  @scala.inline
  implicit class MaskedInputPropsMutableBuilder[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
