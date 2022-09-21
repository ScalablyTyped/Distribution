package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightWidth extends StObject {
  
  /**
    * The shape height specified in units.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The shape width specified in units.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object HeightWidth {
  
  inline def apply(): HeightWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightWidth]
  }
  
  extension [Self <: HeightWidth](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
