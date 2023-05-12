package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicePartitions extends StObject {
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var slicePartitions: js.UndefOr[Double] = js.undefined
  
  var stackPartitions: js.UndefOr[Double] = js.undefined
  
  var subdivisions: js.UndefOr[Double] = js.undefined
}
object SlicePartitions {
  
  inline def apply(): SlicePartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePartitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicePartitions] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSlicePartitions(value: Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    inline def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    inline def setStackPartitions(value: Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    inline def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
