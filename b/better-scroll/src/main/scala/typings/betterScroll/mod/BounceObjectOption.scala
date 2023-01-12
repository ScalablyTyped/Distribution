package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceObjectOption extends StObject {
  
  var bottom: js.UndefOr[Boolean] = js.undefined
  
  var left: js.UndefOr[Boolean] = js.undefined
  
  var right: js.UndefOr[Boolean] = js.undefined
  
  var top: js.UndefOr[Boolean] = js.undefined
}
object BounceObjectOption {
  
  inline def apply(): BounceObjectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BounceObjectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BounceObjectOption] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
