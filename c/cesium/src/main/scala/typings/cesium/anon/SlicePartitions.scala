package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicePartitions extends StObject {
  
  var radius: js.UndefOr[Double] = js.native
  
  var slicePartitions: js.UndefOr[Double] = js.native
  
  var stackPartitions: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
}
object SlicePartitions {
  
  @scala.inline
  def apply(): SlicePartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePartitions]
  }
  
  @scala.inline
  implicit class SlicePartitionsMutableBuilder[Self <: SlicePartitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
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
