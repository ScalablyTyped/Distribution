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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
    
    inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
  }
}
