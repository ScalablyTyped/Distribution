package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Space extends StObject {
  
  /**
    * Set space between bars in bar charts
    */
  var space: js.UndefOr[Double] = js.undefined
  
  /**
    * Change the width of bars. If ratio is specified, change the width of bar chart by ratio.
    */
  var width: js.UndefOr[Double | Ratio] = js.undefined
  
  /**
    * Set if min or max value will be 0 on bar chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}
object Space {
  
  inline def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  
  extension [Self <: Space](x: Self) {
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setWidth(value: Double | Ratio): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZerobased(value: Boolean): Self = StObject.set(x, "zerobased", value.asInstanceOf[js.Any])
    
    inline def setZerobasedUndefined: Self = StObject.set(x, "zerobased", js.undefined)
  }
}
