package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Vec3")
@js.native
class Vec3 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def almostEquals(v: Vec3): scala.Boolean = js.native
  def almostEquals(v: Vec3, precision: scala.Double): scala.Boolean = js.native
  def almostZero(): scala.Boolean = js.native
  def almostZero(precision: scala.Double): scala.Boolean = js.native
  def copy(source: Vec3): Vec3 = js.native
  def cross(v: Vec3): Vec3 = js.native
  def cross(v: Vec3, target: Vec3): Vec3 = js.native
  def crossmat(): Mat3 = js.native
  def distanceTo(p: Vec3): scala.Double = js.native
  def dot(v: Vec3): scala.Double = js.native
  def isAntiparallelTo(v: Vec3): scala.Boolean = js.native
  def isAntiparallelTo(v: Vec3, prescision: scala.Double): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lerp(v: Vec3, t: scala.Double): scala.Unit = js.native
  def lerp(v: Vec3, t: scala.Double, target: Vec3): scala.Unit = js.native
  def mult(scalar: scala.Double): Vec3 = js.native
  def mult(scalar: scala.Double, target: Vec3): Vec3 = js.native
  def negate(): Vec3 = js.native
  def negate(target: Vec3): Vec3 = js.native
  def norm(): scala.Double = js.native
  def norm2(): scala.Double = js.native
  def normalize(): scala.Double = js.native
  def scale(scalar: scala.Double): Vec3 = js.native
  def scale(scalar: scala.Double, target: Vec3): Vec3 = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Vec3 = js.native
  def setZero(): scala.Unit = js.native
  def tangents(t1: Vec3, t2: Vec3): scala.Unit = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def unit(): Vec3 = js.native
  def unit(target: Vec3): Vec3 = js.native
  def vadd(v: Vec3): Vec3 = js.native
  def vadd(v: Vec3, target: Vec3): Vec3 = js.native
  def vsub(v: Vec3): Vec3 = js.native
  def vsub(v: Vec3, target: Vec3): Vec3 = js.native
}

@JSGlobal("CANNON.Vec3")
@js.native
object Vec3 extends js.Object {
  var ZERO: cannonLib.CANNONNs.Vec3 = js.native
}

