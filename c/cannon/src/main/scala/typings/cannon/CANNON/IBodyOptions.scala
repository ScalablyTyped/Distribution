package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyOptions extends js.Object {
  var allowSleep: js.UndefOr[Boolean] = js.native
  var angularDamping: js.UndefOr[Double] = js.native
  var angularVelocity: js.UndefOr[Vec3] = js.native
  var collisionFilterGroup: js.UndefOr[Double] = js.native
  var collisionFilterMask: js.UndefOr[Double] = js.native
  var fixedRotation: js.UndefOr[Boolean] = js.native
  var linearDamping: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var material: js.UndefOr[Material] = js.native
  var position: js.UndefOr[Vec3] = js.native
  var quaternion: js.UndefOr[Quaternion] = js.native
  var shape: js.UndefOr[Shape] = js.native
  var sleepSpeedLimit: js.UndefOr[Double] = js.native
  var sleepTimeLimit: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Vec3] = js.native
}

object IBodyOptions {
  @scala.inline
  def apply(): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyOptions]
  }
  @scala.inline
  implicit class IBodyOptionsOps[Self <: IBodyOptions] (val x: Self) extends AnyVal {
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
    def setAllowSleep(value: Boolean): Self = this.set("allowSleep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSleep: Self = this.set("allowSleep", js.undefined)
    @scala.inline
    def setAngularDamping(value: Double): Self = this.set("angularDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngularDamping: Self = this.set("angularDamping", js.undefined)
    @scala.inline
    def setAngularVelocity(value: Vec3): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngularVelocity: Self = this.set("angularVelocity", js.undefined)
    @scala.inline
    def setCollisionFilterGroup(value: Double): Self = this.set("collisionFilterGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionFilterGroup: Self = this.set("collisionFilterGroup", js.undefined)
    @scala.inline
    def setCollisionFilterMask(value: Double): Self = this.set("collisionFilterMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionFilterMask: Self = this.set("collisionFilterMask", js.undefined)
    @scala.inline
    def setFixedRotation(value: Boolean): Self = this.set("fixedRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRotation: Self = this.set("fixedRotation", js.undefined)
    @scala.inline
    def setLinearDamping(value: Double): Self = this.set("linearDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearDamping: Self = this.set("linearDamping", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setMaterial(value: Material): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setPosition(value: Vec3): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setQuaternion(value: Quaternion): Self = this.set("quaternion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuaternion: Self = this.set("quaternion", js.undefined)
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSleepSpeedLimit(value: Double): Self = this.set("sleepSpeedLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSleepSpeedLimit: Self = this.set("sleepSpeedLimit", js.undefined)
    @scala.inline
    def setSleepTimeLimit(value: Double): Self = this.set("sleepTimeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSleepTimeLimit: Self = this.set("sleepTimeLimit", js.undefined)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVelocity(value: Vec3): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

