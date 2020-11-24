package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumClock extends js.Object {
  
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
  implicit class MaximumClockOps[Self <: MaximumClock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInnerRadii(value: Cartesian3): Self = this.set("innerRadii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadii: Self = this.set("innerRadii", js.undefined)
    
    @scala.inline
    def setMaximumClock(value: Double): Self = this.set("maximumClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumClock: Self = this.set("maximumClock", js.undefined)
    
    @scala.inline
    def setMaximumCone(value: Double): Self = this.set("maximumCone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumCone: Self = this.set("maximumCone", js.undefined)
    
    @scala.inline
    def setMinimumClock(value: Double): Self = this.set("minimumClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumClock: Self = this.set("minimumClock", js.undefined)
    
    @scala.inline
    def setMinimumCone(value: Double): Self = this.set("minimumCone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCone: Self = this.set("minimumCone", js.undefined)
    
    @scala.inline
    def setRadii(value: Cartesian3): Self = this.set("radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Double): Self = this.set("slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicePartitions: Self = this.set("slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Double): Self = this.set("stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPartitions: Self = this.set("stackPartitions", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
}
