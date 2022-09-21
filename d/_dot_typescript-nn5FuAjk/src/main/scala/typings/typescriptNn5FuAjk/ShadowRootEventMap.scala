package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootEventMap extends StObject {
  
  var slotchange: Event
}
object ShadowRootEventMap {
  
  inline def apply(slotchange: Event): ShadowRootEventMap = {
    val __obj = js.Dynamic.literal(slotchange = slotchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootEventMap]
  }
  
  extension [Self <: ShadowRootEventMap](x: Self) {
    
    inline def setSlotchange(value: Event): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
  }
}
