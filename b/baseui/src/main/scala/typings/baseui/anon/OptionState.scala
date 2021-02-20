package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionState extends StObject {
  
  var option: typings.baseui.selectMod.Option = js.native
  
  var optionState: IsHighlighted = js.native
}
object OptionState {
  
  @scala.inline
  def apply(option: typings.baseui.selectMod.Option, optionState: IsHighlighted): OptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionState]
  }
  
  @scala.inline
  implicit class OptionStateMutableBuilder[Self <: OptionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionState(value: IsHighlighted): Self = StObject.set(x, "optionState", value.asInstanceOf[js.Any])
  }
}
