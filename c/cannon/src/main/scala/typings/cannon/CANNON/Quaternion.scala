package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quaternion extends js.Object {
  
  def conjugate(): Quaternion = js.native
  def conjugate(target: Quaternion): Quaternion = js.native
  
  def copy(source: Quaternion): Quaternion = js.native
  
  def inverse(): Quaternion = js.native
  def inverse(target: Quaternion): Quaternion = js.native
  
  def mult(q: Quaternion): Quaternion = js.native
  def mult(q: Quaternion, target: Quaternion): Quaternion = js.native
  
  def normalize(): Unit = js.native
  
  def normalizeFast(): Unit = js.native
  
  def set(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  
  def setFromAxisAngle(axis: Vec3, angle: Double): Unit = js.native
  
  def setFromEuler(x: Double, y: Double, z: Double): Quaternion = js.native
  def setFromEuler(x: Double, y: Double, z: Double, order: String): Quaternion = js.native
  
  def setFromVectors(u: Vec3, v: Vec3): Unit = js.native
  
  def toArray(): js.Array[Double] = js.native
  
  def toAxisAngle(): js.Array[_] = js.native
  def toAxisAngle(targetAxis: Vec3): js.Array[_] = js.native
  
  def toEuler(target: Vec3): Unit = js.native
  def toEuler(target: Vec3, order: String): Unit = js.native
  
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
