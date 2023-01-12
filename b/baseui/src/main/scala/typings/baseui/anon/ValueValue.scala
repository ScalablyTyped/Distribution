package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValue extends StObject {
  
  var value: typings.baseui.selectTypesMod.Value
}
object ValueValue {
  
  inline def apply(value: typings.baseui.selectTypesMod.Value): ValueValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: typings.baseui.selectTypesMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: typings.baseui.selectTypesMod.Option*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
