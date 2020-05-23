package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vec3 extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def almostEquals(v: Vec3): Boolean = js.native
  def almostEquals(v: Vec3, precision: Double): Boolean = js.native
  def almostZero(): Boolean = js.native
  def almostZero(precision: Double): Boolean = js.native
  def copy(source: Vec3): Vec3 = js.native
  def cross(v: Vec3): Vec3 = js.native
  def cross(v: Vec3, target: Vec3): Vec3 = js.native
  def crossmat(): Mat3 = js.native
  def distanceTo(p: Vec3): Double = js.native
  def dot(v: Vec3): Double = js.native
  def isAntiparallelTo(v: Vec3): Boolean = js.native
  def isAntiparallelTo(v: Vec3, prescision: Double): Boolean = js.native
  def isZero(): Boolean = js.native
  def lerp(v: Vec3, t: Double): Unit = js.native
  def lerp(v: Vec3, t: Double, target: Vec3): Unit = js.native
  def mult(scalar: Double): Vec3 = js.native
  def mult(scalar: Double, target: Vec3): Vec3 = js.native
  def negate(): Vec3 = js.native
  def negate(target: Vec3): Vec3 = js.native
  def norm(): Double = js.native
  def norm2(): Double = js.native
  def normalize(): Double = js.native
  def scale(scalar: Double): Vec3 = js.native
  def scale(scalar: Double, target: Vec3): Vec3 = js.native
  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  def setZero(): Unit = js.native
  def tangents(t1: Vec3, t2: Vec3): Unit = js.native
  def toArray(): js.Array[Double] = js.native
  def unit(): Vec3 = js.native
  def unit(target: Vec3): Vec3 = js.native
  def vadd(v: Vec3): Vec3 = js.native
  def vadd(v: Vec3, target: Vec3): Vec3 = js.native
  def vsub(v: Vec3): Vec3 = js.native
  def vsub(v: Vec3, target: Vec3): Vec3 = js.native
}

