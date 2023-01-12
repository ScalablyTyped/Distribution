package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivLayout extends StObject {
  
  /**
    * Container Height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Container Width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object DivLayout {
  
  inline def apply(): DivLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DivLayout] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
