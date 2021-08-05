package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var option: js.UndefOr[typings.baseui.selectMod.Option] = js.undefined
  
  var optionState: Disabled
}
object Option {
  
  inline def apply(optionState: Disabled): Option = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionState(value: Disabled): Self = StObject.set(x, "optionState", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
