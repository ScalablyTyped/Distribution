package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumClock extends StObject {
  
  var innerRadii: js.UndefOr[Cartesian3] = js.native
  
  var maximumClock: js.UndefOr[Double] = js.native
  
  var maximumCone: js.UndefOr[Double] = js.native
  
  var minimumClock: js.UndefOr[Double] = js.native
  
  var minimumCone: js.UndefOr[Double] = js.native
  
  var radii: js.UndefOr[Cartesian3] = js.native
  
  var slicePartitions: js.UndefOr[Double] = js.native
  
  var stackPartitions: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
}
object MaximumClock {
  
  @scala.inline
  def apply(): MaximumClock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumClock]
  }
  
  @scala.inline
  implicit class MaximumClockMutableBuilder[Self <: MaximumClock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerRadii(value: Cartesian3): Self = StObject.set(x, "innerRadii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiiUndefined: Self = StObject.set(x, "innerRadii", js.undefined)
    
    @scala.inline
    def setMaximumClock(value: Double): Self = StObject.set(x, "maximumClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumClockUndefined: Self = StObject.set(x, "maximumClock", js.undefined)
    
    @scala.inline
    def setMaximumCone(value: Double): Self = StObject.set(x, "maximumCone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumConeUndefined: Self = StObject.set(x, "maximumCone", js.undefined)
    
    @scala.inline
    def setMinimumClock(value: Double): Self = StObject.set(x, "minimumClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumClockUndefined: Self = StObject.set(x, "minimumClock", js.undefined)
    
    @scala.inline
    def setMinimumCone(value: Double): Self = StObject.set(x, "minimumCone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumConeUndefined: Self = StObject.set(x, "minimumCone", js.undefined)
    
    @scala.inline
    def setRadii(value: Cartesian3): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Double): Self = StObject.set(x, "slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicePartitionsUndefined: Self = StObject.set(x, "slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Double): Self = StObject.set(x, "stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPartitionsUndefined: Self = StObject.set(x, "stackPartitions", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
