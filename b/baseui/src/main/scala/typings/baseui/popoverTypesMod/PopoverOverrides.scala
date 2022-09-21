package typings.baseui.popoverTypesMod

import typings.baseui.overridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverOverrides extends StObject {
  
  var Arrow: js.UndefOr[Override[Any]] = js.undefined
  
  var Body: js.UndefOr[Override[Any]] = js.undefined
  
  var Inner: js.UndefOr[Override[Any]] = js.undefined
}
object PopoverOverrides {
  
  inline def apply(): PopoverOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOverrides]
  }
  
  extension [Self <: PopoverOverrides](x: Self) {
    
    inline def setArrow(value: Override[Any]): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
    
    inline def setBody(value: Override[Any]): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setInner(value: Override[Any]): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
    
    inline def setInnerUndefined: Self = StObject.set(x, "Inner", js.undefined)
  }
}
