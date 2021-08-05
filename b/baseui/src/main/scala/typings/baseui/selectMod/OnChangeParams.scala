package typings.baseui.selectMod

import typings.baseui.baseuiStrings.clear
import typings.baseui.baseuiStrings.remove
import typings.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChangeParams extends StObject {
  
  var option: js.UndefOr[Option] = js.undefined
  
  var `type`: js.UndefOr[select | remove | clear] = js.undefined
  
  var value: Value
}
object OnChangeParams {
  
  inline def apply(value: Value): OnChangeParams = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  
  extension [Self <: OnChangeParams](x: Self) {
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setType(value: select | remove | clear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
