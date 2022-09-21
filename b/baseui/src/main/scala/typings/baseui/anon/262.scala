package typings.baseui.anon

import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262` extends StObject {
  
  var current: js.UndefOr[SVGSVGElement | Null] = js.undefined
}
object `262` {
  
  inline def apply(): `262` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`262`]
  }
  
  extension [Self <: `262`](x: Self) {
    
    inline def setCurrent(value: SVGSVGElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}
