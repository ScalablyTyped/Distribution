package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionOption extends StObject {
  
  var option: typings.baseui.selectMod.Option
}
object OptionOption {
  
  @scala.inline
  def apply(option: typings.baseui.selectMod.Option): OptionOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionOption]
  }
  
  @scala.inline
  implicit class OptionOptionMutableBuilder[Self <: OptionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
