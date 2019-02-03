package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Box")
@js.native
class Box protected () extends Shape {
  def this(halfExtents: Vec3) = this()
  var convexPolyhedronRepresentation: ConvexPolyhedron = js.native
  var halfExtents: Vec3 = js.native
  def calculateLocalInertia(mass: scala.Double): Vec3 = js.native
  def forEachWorldCorner(pos: Vec3, quat: Quaternion, callback: js.Function): scala.Unit = js.native
  def getSideNormals(sixTargetVectors: scala.Boolean): js.Array[Vec3] = js.native
  def getSideNormals(sixTargetVectors: scala.Boolean, quat: Quaternion): js.Array[Vec3] = js.native
  def updateConvexPolyhedronRepresentation(): scala.Unit = js.native
}

/* static members */
@JSGlobal("CANNON.Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: cannonLib.CANNONNs.Vec3, mass: scala.Double, target: cannonLib.CANNONNs.Vec3): scala.Unit = js.native
}

