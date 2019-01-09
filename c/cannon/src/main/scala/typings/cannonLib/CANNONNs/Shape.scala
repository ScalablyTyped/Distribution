package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Shape")
@js.native
class Shape () extends js.Object {
  var boundingSphereRadius: scala.Double = js.native
  var collisionResponse: scala.Boolean = js.native
  var `type`: scala.Double = js.native
  def calculateLocalInertia(mass: scala.Double, target: Vec3): Vec3 = js.native
  def updateBoundingSphereRadius(): scala.Double = js.native
  def volume(): scala.Double = js.native
}

@JSGlobal("CANNON.Shape")
@js.native
object Shape extends js.Object {
  var types: cannonLib.Anon_BOX = js.native
}

