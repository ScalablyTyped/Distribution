package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.WheelInfo")
@js.native
class WheelInfo () extends js.Object {
  def this(options: IWheelInfoOptions) = this()
  var axleLocal: Vec3 = js.native
  var axleWorld: Vec3 = js.native
  var brake: Double = js.native
  var chassisConnectionPointLocal: Vec3 = js.native
  var chassisConnectionPointWorld: Vec3 = js.native
  var clippedInvContactDotSuspension: Double = js.native
  var customSlidingRotationalSpeed: Double = js.native
  var dampingCompression: Double = js.native
  var dampingRelaxation: Double = js.native
  var deltaRotation: Double = js.native
  var directionLocal: Vec3 = js.native
  var directionWorld: Vec3 = js.native
  var engineForce: Double = js.native
  var forwardImpulse: Double = js.native
  var frictionSlip: Double = js.native
  var isFrontWheel: Boolean = js.native
  var isInContact: Boolean = js.native
  var maxSuspensionForce: Double = js.native
  var maxSuspensionTravbel: Double = js.native
  var radius: Double = js.native
  var raycastResult: RaycastResult = js.native
  var rollInfluence: Double = js.native
  var rotation: Double = js.native
  var sideImpulse: Double = js.native
  var skidInfo: Double = js.native
  var sliding: Boolean = js.native
  var steering: Double = js.native
  var suspensionForce: Double = js.native
  var suspensionLength: Double = js.native
  var suspensionMaxLength: Double = js.native
  var suspensionRelativeVelocity: Double = js.native
  var suspensionRestLength: Double = js.native
  var suspensionStiffness: Double = js.native
  var useCustomSlidingRotationalSpeed: Boolean = js.native
  var worldTransform: Transform = js.native
}

