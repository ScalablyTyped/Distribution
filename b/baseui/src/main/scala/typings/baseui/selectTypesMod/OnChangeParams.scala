package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChangeParams extends StObject {
  
  var option: js.UndefOr[Option | Null] = js.undefined
  
  var `type`: ChangeAction
  
  var value: Value
}
object OnChangeParams {
  
  inline def apply(`type`: ChangeAction, value: Value): OnChangeParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChangeParams] (val x: Self) extends AnyVal {
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionNull: Self = StObject.set(x, "option", null)
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setType(value: ChangeAction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
