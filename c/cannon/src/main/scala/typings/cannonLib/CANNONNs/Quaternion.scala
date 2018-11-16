package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Quaternion")
@js.native
class Quaternion () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def conjugate(): Quaternion = js.native
  def conjugate(target: Quaternion): Quaternion = js.native
  def copy(source: Quaternion): Quaternion = js.native
  def inverse(): Quaternion = js.native
  def inverse(target: Quaternion): Quaternion = js.native
  def mult(q: Quaternion): Quaternion = js.native
  def mult(q: Quaternion, target: Quaternion): Quaternion = js.native
  def normalize(): scala.Unit = js.native
  def normalizeFast(): scala.Unit = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Unit = js.native
  def setFromAxisAngle(axis: Vec3, angle: scala.Double): scala.Unit = js.native
  def setFromEuler(x: scala.Double, y: scala.Double, z: scala.Double): Quaternion = js.native
  def setFromEuler(x: scala.Double, y: scala.Double, z: scala.Double, order: java.lang.String): Quaternion = js.native
  def setFromVectors(u: Vec3, v: Vec3): scala.Unit = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toAxisAngle(): js.Array[_] = js.native
  def toAxisAngle(targetAxis: Vec3): js.Array[_] = js.native
  def toEuler(target: Vec3): scala.Unit = js.native
  def toEuler(target: Vec3, order: java.lang.String): scala.Unit = js.native
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
}

