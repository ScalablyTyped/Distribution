package typings.baseui.themesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndex extends StObject {
  
  var modal: Double
}
object ZIndex {
  
  inline def apply(modal: Double): ZIndex = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  
  extension [Self <: ZIndex](x: Self) {
    
    inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
  }
}
