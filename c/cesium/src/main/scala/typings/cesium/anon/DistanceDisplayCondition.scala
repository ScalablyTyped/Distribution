package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceDisplayCondition extends js.Object {
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  var leadTime: js.UndefOr[Property | Double] = js.native
  
  var material: js.UndefOr[MaterialProperty] = js.native
  
  var resolution: js.UndefOr[Property | Double] = js.native
  
  var show: js.UndefOr[Property | Boolean] = js.native
  
  var trailTime: js.UndefOr[Property | Double] = js.native
  
  var width: js.UndefOr[Property | Double] = js.native
}
object DistanceDisplayCondition {
  
  @scala.inline
  def apply(): DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceDisplayCondition]
  }
  
  @scala.inline
  implicit class DistanceDisplayConditionOps[Self <: DistanceDisplayCondition] (val x: Self) extends AnyVal {
    
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
    def setDistanceDisplayCondition(value: Property): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setLeadTime(value: Property | Double): Self = this.set("leadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadTime: Self = this.set("leadTime", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setResolution(value: Property | Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTrailTime(value: Property | Double): Self = this.set("trailTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailTime: Self = this.set("trailTime", js.undefined)
    
    @scala.inline
    def setWidth(value: Property | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
