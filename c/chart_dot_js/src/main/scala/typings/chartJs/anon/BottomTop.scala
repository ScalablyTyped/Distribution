package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomTop extends StObject {
  
  var bottom: Double
  
  var top: Double
}
object BottomTop {
  
  inline def apply(bottom: Double, top: Double): BottomTop = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomTop] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
