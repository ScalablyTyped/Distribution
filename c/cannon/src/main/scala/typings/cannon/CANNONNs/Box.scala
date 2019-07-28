package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Box")
@js.native
class Box protected () extends Shape {
  def this(halfExtents: Vec3) = this()
  var convexPolyhedronRepresentation: ConvexPolyhedron = js.native
  var halfExtents: Vec3 = js.native
  def calculateLocalInertia(mass: Double): Vec3 = js.native
  def forEachWorldCorner(pos: Vec3, quat: Quaternion, callback: js.Function): Unit = js.native
  def getSideNormals(sixTargetVectors: Boolean): js.Array[Vec3] = js.native
  def getSideNormals(sixTargetVectors: Boolean, quat: Quaternion): js.Array[Vec3] = js.native
  def updateConvexPolyhedronRepresentation(): Unit = js.native
}

/* static members */
@JSGlobal("CANNON.Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: Vec3, mass: Double, target: Vec3): Unit = js.native
}

