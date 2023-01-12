package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHandleTooltip extends StObject {
  
  var isHandleTooltip: Boolean
}
object IsHandleTooltip {
  
  inline def apply(isHandleTooltip: Boolean): IsHandleTooltip = {
    val __obj = js.Dynamic.literal(isHandleTooltip = isHandleTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHandleTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsHandleTooltip] (val x: Self) extends AnyVal {
    
    inline def setIsHandleTooltip(value: Boolean): Self = StObject.set(x, "isHandleTooltip", value.asInstanceOf[js.Any])
  }
}
