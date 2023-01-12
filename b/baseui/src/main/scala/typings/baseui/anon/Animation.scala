package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  @JSName("$animation")
  var $animation: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$height")
  var $height: js.UndefOr[String] = js.undefined
  
  @JSName("$rows")
  var $rows: js.UndefOr[Double] = js.undefined
  
  @JSName("$width")
  var $width: js.UndefOr[String] = js.undefined
}
object Animation {
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def set$animation(value: Boolean): Self = StObject.set(x, "$animation", value.asInstanceOf[js.Any])
    
    inline def set$animationUndefined: Self = StObject.set(x, "$animation", js.undefined)
    
    inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$heightUndefined: Self = StObject.set(x, "$height", js.undefined)
    
    inline def set$rows(value: Double): Self = StObject.set(x, "$rows", value.asInstanceOf[js.Any])
    
    inline def set$rowsUndefined: Self = StObject.set(x, "$rows", js.undefined)
    
    inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
    
    inline def set$widthUndefined: Self = StObject.set(x, "$width", js.undefined)
  }
}
