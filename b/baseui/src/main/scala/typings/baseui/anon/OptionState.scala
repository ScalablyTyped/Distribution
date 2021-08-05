package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionState extends StObject {
  
  var option: typings.baseui.selectMod.Option
  
  var optionState: IsHighlighted
}
object OptionState {
  
  inline def apply(option: typings.baseui.selectMod.Option, optionState: IsHighlighted): OptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionState]
  }
  
  extension [Self <: OptionState](x: Self) {
    
    inline def setOption(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionState(value: IsHighlighted): Self = StObject.set(x, "optionState", value.asInstanceOf[js.Any])
  }
}
