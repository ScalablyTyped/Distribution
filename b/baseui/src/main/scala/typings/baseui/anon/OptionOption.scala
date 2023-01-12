package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionOption extends StObject {
  
  var option: typings.baseui.selectTypesMod.Option
}
object OptionOption {
  
  inline def apply(option: typings.baseui.selectTypesMod.Option): OptionOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionOption] (val x: Self) extends AnyVal {
    
    inline def setOption(value: typings.baseui.selectTypesMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
