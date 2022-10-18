package typings.baseui.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255` extends StObject {
  
  var current: HTMLInputElement | Null
}
object `255` {
  
  inline def apply(): `255` = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[`255`]
  }
  
  extension [Self <: `255`](x: Self) {
    
    inline def setCurrent(value: HTMLInputElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
