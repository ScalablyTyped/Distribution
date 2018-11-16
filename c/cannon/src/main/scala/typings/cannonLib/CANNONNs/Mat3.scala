package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Mat3")
@js.native
class Mat3 () extends js.Object {
  def this(elements: js.Array[scala.Double]) = this()
  def copy(source: Mat3): Mat3 = js.native
  def e(row: scala.Double, column: scala.Double): scala.Double = js.native
  def e(row: scala.Double, column: scala.Double, value: scala.Double): scala.Double = js.native
  def getTrace(target: Vec3): scala.Unit = js.native
  def identity(): scala.Unit = js.native
  def mmult(m: Mat3): Mat3 = js.native
  def reverse(): Mat3 = js.native
  def reverse(target: Mat3): Mat3 = js.native
  def scale(v: Vec3): Mat3 = js.native
  def scale(v: Vec3, target: Mat3): Mat3 = js.native
  def setRotationFromQuaternion(q: Quaternion): Mat3 = js.native
  def setTrace(vec3: Vec3): scala.Unit = js.native
  def setZero(): scala.Unit = js.native
  def smult(s: scala.Double): scala.Unit = js.native
  def solve(b: Vec3): Vec3 = js.native
  def solve(b: Vec3, target: Vec3): Vec3 = js.native
  def transpose(): Mat3 = js.native
  def transpose(target: Mat3): Mat3 = js.native
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
}

