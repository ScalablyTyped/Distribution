package typings.baseui.anon

import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259` extends StObject {
  
  var current: js.UndefOr[SVGSVGElement | Null] = js.undefined
}
object `259` {
  
  inline def apply(): `259` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`259`]
  }
  
  extension [Self <: `259`](x: Self) {
    
    inline def setCurrent(value: SVGSVGElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}
