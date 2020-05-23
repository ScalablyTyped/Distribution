package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends Shape {
  var convexPolyhedronRepresentation: ConvexPolyhedron = js.native
  var halfExtents: Vec3 = js.native
  def calculateLocalInertia(mass: Double): Vec3 = js.native
  def forEachWorldCorner(pos: Vec3, quat: Quaternion, callback: js.Function): Unit = js.native
  def getSideNormals(sixTargetVectors: Boolean): js.Array[Vec3] = js.native
  def getSideNormals(sixTargetVectors: Boolean, quat: Quaternion): js.Array[Vec3] = js.native
  def updateConvexPolyhedronRepresentation(): Unit = js.native
}

