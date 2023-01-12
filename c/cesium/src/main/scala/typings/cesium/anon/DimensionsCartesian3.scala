package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionsCartesian3 extends StObject {
  
  var dimensions: Cartesian3
}
object DimensionsCartesian3 {
  
  inline def apply(dimensions: Cartesian3): DimensionsCartesian3 = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsCartesian3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionsCartesian3] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: Cartesian3): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
  }
}
