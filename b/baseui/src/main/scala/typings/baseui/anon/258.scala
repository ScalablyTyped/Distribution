package typings.baseui.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258` extends StObject {
  
  var current: HTMLInputElement | Null
}
object `258` {
  
  inline def apply(): `258` = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[`258`]
  }
  
  extension [Self <: `258`](x: Self) {
    
    inline def setCurrent(value: HTMLInputElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
