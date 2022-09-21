package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shift extends StObject {
  
  /**
    * Specifies the color of ticks.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the length of ticks in pixels.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how transparent ticks should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Shifts ticks from the reference position.
    */
  var shift: js.UndefOr[Double] = js.undefined
  
  /**
    * Makes ticks visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of ticks in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Shift {
  
  inline def apply(): Shift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shift]
  }
  
  extension [Self <: Shift](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
