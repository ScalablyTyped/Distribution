package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.WheelInfo")
@js.native
class WheelInfo () extends js.Object {
  def this(options: IWheelInfoOptions) = this()
  var axleLocal: Vec3 = js.native
  var axleWorld: Vec3 = js.native
  var brake: scala.Double = js.native
  var chassisConnectionPointLocal: Vec3 = js.native
  var chassisConnectionPointWorld: Vec3 = js.native
  var clippedInvContactDotSuspension: scala.Double = js.native
  var customSlidingRotationalSpeed: scala.Double = js.native
  var dampingCompression: scala.Double = js.native
  var dampingRelaxation: scala.Double = js.native
  var deltaRotation: scala.Double = js.native
  var directionLocal: Vec3 = js.native
  var directionWorld: Vec3 = js.native
  var engineForce: scala.Double = js.native
  var forwardImpulse: scala.Double = js.native
  var frictionSlip: scala.Double = js.native
  var isFrontWheel: scala.Boolean = js.native
  var isInContact: scala.Boolean = js.native
  var maxSuspensionForce: scala.Double = js.native
  var maxSuspensionTravbel: scala.Double = js.native
  var radius: scala.Double = js.native
  var raycastResult: RaycastResult = js.native
  var rollInfluence: scala.Double = js.native
  var rotation: scala.Double = js.native
  var sideImpulse: scala.Double = js.native
  var skidInfo: scala.Double = js.native
  var sliding: scala.Boolean = js.native
  var steering: scala.Double = js.native
  var suspensionForce: scala.Double = js.native
  var suspensionLength: scala.Double = js.native
  var suspensionMaxLength: scala.Double = js.native
  var suspensionRelativeVelocity: scala.Double = js.native
  var suspensionRestLength: scala.Double = js.native
  var suspensionStiffness: scala.Double = js.native
  var useCustomSlidingRotationalSpeed: scala.Boolean = js.native
  var worldTransform: Transform = js.native
}

