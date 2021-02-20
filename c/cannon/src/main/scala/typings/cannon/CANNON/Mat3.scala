package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mat3 extends StObject {
  
  def copy(source: Mat3): Mat3 = js.native
  
  def e(row: Double, column: Double): Double = js.native
  def e(row: Double, column: Double, value: Double): Double = js.native
  
  def getTrace(target: Vec3): Unit = js.native
  
  def identity(): Unit = js.native
  
  def mmult(m: Mat3): Mat3 = js.native
  
  def reverse(): Mat3 = js.native
  def reverse(target: Mat3): Mat3 = js.native
  
  def scale(v: Vec3): Mat3 = js.native
  def scale(v: Vec3, target: Mat3): Mat3 = js.native
  
  def setRotationFromQuaternion(q: Quaternion): Mat3 = js.native
  
  def setTrace(vec3: Vec3): Unit = js.native
  
  def setZero(): Unit = js.native
  
  def smult(s: Double): Unit = js.native
  
  def solve(b: Vec3): Vec3 = js.native
  def solve(b: Vec3, target: Vec3): Vec3 = js.native
  
  def transpose(): Mat3 = js.native
  def transpose(target: Mat3): Mat3 = js.native
  
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
}
