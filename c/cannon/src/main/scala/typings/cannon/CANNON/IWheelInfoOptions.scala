package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWheelInfoOptions extends js.Object {
  
  var axis: js.UndefOr[Vec3] = js.native
  
  var axleLocal: js.UndefOr[Vec3] = js.native
  
  var axleWorld: js.UndefOr[Vec3] = js.native
  
  var body: js.UndefOr[Body] = js.native
  
  var chassisConnectionPointLocal: js.UndefOr[Vec3] = js.native
  
  var chassisConnectionPointWorld: js.UndefOr[Vec3] = js.native
  
  var clippedInvContactDotSuspension: js.UndefOr[Double] = js.native
  
  var customSlidingRotationalSpeed: js.UndefOr[Double] = js.native
  
  var dampingCompression: js.UndefOr[Double] = js.native
  
  var dampingRelaxation: js.UndefOr[Double] = js.native
  
  var deltaRotation: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[Vec3] = js.native
  
  var directionLocal: js.UndefOr[Vec3] = js.native
  
  var directionWorld: js.UndefOr[Vec3] = js.native
  
  var frictionSlip: js.UndefOr[Double] = js.native
  
  var isFronmtWheel: js.UndefOr[Boolean] = js.native
  
  var maxSuspensionForce: js.UndefOr[Double] = js.native
  
  var maxSuspensionTravel: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Vec3] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var rollInfluence: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var skidInfo: js.UndefOr[Double] = js.native
  
  var steering: js.UndefOr[Double] = js.native
  
  var suspensionForce: js.UndefOr[Double] = js.native
  
  var suspensionLength: js.UndefOr[Double] = js.native
  
  var suspensionMaxLength: js.UndefOr[Double] = js.native
  
  var suspensionRelativeVelocity: js.UndefOr[Double] = js.native
  
  var suspensionRestLength: js.UndefOr[Double] = js.native
  
  var suspensionStiffness: js.UndefOr[Double] = js.native
  
  var useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.native
}
object IWheelInfoOptions {
  
  @scala.inline
  def apply(): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWheelInfoOptions]
  }
  
  @scala.inline
  implicit class IWheelInfoOptionsOps[Self <: IWheelInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: Vec3): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setAxleLocal(value: Vec3): Self = this.set("axleLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxleLocal: Self = this.set("axleLocal", js.undefined)
    
    @scala.inline
    def setAxleWorld(value: Vec3): Self = this.set("axleWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxleWorld: Self = this.set("axleWorld", js.undefined)
    
    @scala.inline
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setChassisConnectionPointLocal(value: Vec3): Self = this.set("chassisConnectionPointLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChassisConnectionPointLocal: Self = this.set("chassisConnectionPointLocal", js.undefined)
    
    @scala.inline
    def setChassisConnectionPointWorld(value: Vec3): Self = this.set("chassisConnectionPointWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChassisConnectionPointWorld: Self = this.set("chassisConnectionPointWorld", js.undefined)
    
    @scala.inline
    def setClippedInvContactDotSuspension(value: Double): Self = this.set("clippedInvContactDotSuspension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippedInvContactDotSuspension: Self = this.set("clippedInvContactDotSuspension", js.undefined)
    
    @scala.inline
    def setCustomSlidingRotationalSpeed(value: Double): Self = this.set("customSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSlidingRotationalSpeed: Self = this.set("customSlidingRotationalSpeed", js.undefined)
    
    @scala.inline
    def setDampingCompression(value: Double): Self = this.set("dampingCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDampingCompression: Self = this.set("dampingCompression", js.undefined)
    
    @scala.inline
    def setDampingRelaxation(value: Double): Self = this.set("dampingRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDampingRelaxation: Self = this.set("dampingRelaxation", js.undefined)
    
    @scala.inline
    def setDeltaRotation(value: Double): Self = this.set("deltaRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaRotation: Self = this.set("deltaRotation", js.undefined)
    
    @scala.inline
    def setDirection(value: Vec3): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionLocal(value: Vec3): Self = this.set("directionLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionLocal: Self = this.set("directionLocal", js.undefined)
    
    @scala.inline
    def setDirectionWorld(value: Vec3): Self = this.set("directionWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionWorld: Self = this.set("directionWorld", js.undefined)
    
    @scala.inline
    def setFrictionSlip(value: Double): Self = this.set("frictionSlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionSlip: Self = this.set("frictionSlip", js.undefined)
    
    @scala.inline
    def setIsFronmtWheel(value: Boolean): Self = this.set("isFronmtWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFronmtWheel: Self = this.set("isFronmtWheel", js.undefined)
    
    @scala.inline
    def setMaxSuspensionForce(value: Double): Self = this.set("maxSuspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSuspensionForce: Self = this.set("maxSuspensionForce", js.undefined)
    
    @scala.inline
    def setMaxSuspensionTravel(value: Double): Self = this.set("maxSuspensionTravel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSuspensionTravel: Self = this.set("maxSuspensionTravel", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRollInfluence(value: Double): Self = this.set("rollInfluence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollInfluence: Self = this.set("rollInfluence", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSkidInfo(value: Double): Self = this.set("skidInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkidInfo: Self = this.set("skidInfo", js.undefined)
    
    @scala.inline
    def setSteering(value: Double): Self = this.set("steering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteering: Self = this.set("steering", js.undefined)
    
    @scala.inline
    def setSuspensionForce(value: Double): Self = this.set("suspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionForce: Self = this.set("suspensionForce", js.undefined)
    
    @scala.inline
    def setSuspensionLength(value: Double): Self = this.set("suspensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionLength: Self = this.set("suspensionLength", js.undefined)
    
    @scala.inline
    def setSuspensionMaxLength(value: Double): Self = this.set("suspensionMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionMaxLength: Self = this.set("suspensionMaxLength", js.undefined)
    
    @scala.inline
    def setSuspensionRelativeVelocity(value: Double): Self = this.set("suspensionRelativeVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionRelativeVelocity: Self = this.set("suspensionRelativeVelocity", js.undefined)
    
    @scala.inline
    def setSuspensionRestLength(value: Double): Self = this.set("suspensionRestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionRestLength: Self = this.set("suspensionRestLength", js.undefined)
    
    @scala.inline
    def setSuspensionStiffness(value: Double): Self = this.set("suspensionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionStiffness: Self = this.set("suspensionStiffness", js.undefined)
    
    @scala.inline
    def setUseCustomSlidingRotationalSpeed(value: Boolean): Self = this.set("useCustomSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomSlidingRotationalSpeed: Self = this.set("useCustomSlidingRotationalSpeed", js.undefined)
  }
}
