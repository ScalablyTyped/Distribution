package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionShow extends StObject {
  
  var position: js.UndefOr[Top] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
}
object PositionShow {
  
  inline def apply(): PositionShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionShow]
  }
  
  extension [Self <: PositionShow](x: Self) {
    
    inline def setPosition(value: Top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
