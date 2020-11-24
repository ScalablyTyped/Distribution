package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Space
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustRoll extends js.Object {
  
  var adjustPitch: js.UndefOr[Double] = js.native
  
  var adjustRoll: js.UndefOr[Double] = js.native
  
  var adjustYaw: js.UndefOr[Double] = js.native
  
  var maxPitch: js.UndefOr[Double] = js.native
  
  var maxYaw: js.UndefOr[Double] = js.native
  
  var minPitch: js.UndefOr[Double] = js.native
  
  var minYaw: js.UndefOr[Double] = js.native
  
  var pitchAxis: js.UndefOr[Vector3] = js.native
  
  var slerpAmount: js.UndefOr[Double] = js.native
  
  var upAxis: js.UndefOr[Vector3] = js.native
  
  var upAxisSpace: js.UndefOr[Space] = js.native
  
  var yawAxis: js.UndefOr[Vector3] = js.native
}
object AdjustRoll {
  
  @scala.inline
  def apply(): AdjustRoll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustRoll]
  }
  
  @scala.inline
  implicit class AdjustRollOps[Self <: AdjustRoll] (val x: Self) extends AnyVal {
    
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
    def setAdjustPitch(value: Double): Self = this.set("adjustPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustPitch: Self = this.set("adjustPitch", js.undefined)
    
    @scala.inline
    def setAdjustRoll(value: Double): Self = this.set("adjustRoll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustRoll: Self = this.set("adjustRoll", js.undefined)
    
    @scala.inline
    def setAdjustYaw(value: Double): Self = this.set("adjustYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustYaw: Self = this.set("adjustYaw", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPitch: Self = this.set("maxPitch", js.undefined)
    
    @scala.inline
    def setMaxYaw(value: Double): Self = this.set("maxYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxYaw: Self = this.set("maxYaw", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = this.set("minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPitch: Self = this.set("minPitch", js.undefined)
    
    @scala.inline
    def setMinYaw(value: Double): Self = this.set("minYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinYaw: Self = this.set("minYaw", js.undefined)
    
    @scala.inline
    def setPitchAxis(value: Vector3): Self = this.set("pitchAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchAxis: Self = this.set("pitchAxis", js.undefined)
    
    @scala.inline
    def setSlerpAmount(value: Double): Self = this.set("slerpAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlerpAmount: Self = this.set("slerpAmount", js.undefined)
    
    @scala.inline
    def setUpAxis(value: Vector3): Self = this.set("upAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpAxis: Self = this.set("upAxis", js.undefined)
    
    @scala.inline
    def setUpAxisSpace(value: Space): Self = this.set("upAxisSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpAxisSpace: Self = this.set("upAxisSpace", js.undefined)
    
    @scala.inline
    def setYawAxis(value: Vector3): Self = this.set("yawAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYawAxis: Self = this.set("yawAxis", js.undefined)
  }
}
