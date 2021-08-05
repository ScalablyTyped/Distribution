package typings.baseui.menuMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuPropsT extends StObject {
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
}
object BaseMenuPropsT {
  
  inline def apply(): BaseMenuPropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuPropsT]
  }
  
  extension [Self <: BaseMenuPropsT](x: Self) {
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
  }
}
