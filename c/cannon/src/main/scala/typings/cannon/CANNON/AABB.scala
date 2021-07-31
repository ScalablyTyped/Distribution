package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AABB extends StObject {
  
  def copy(aabb: AABB): Unit = js.native
  
  def extend(aabb: AABB): Unit = js.native
  
  def getCorners(a: Vec3, b: Vec3, c: Vec3, d: Vec3, e: Vec3, f: Vec3, g: Vec3, h: Vec3): Unit = js.native
  
  var lowerBound: Vec3 = js.native
  
  def overlaps(aabb: AABB): Boolean = js.native
  
  def setFromPoints(points: js.Array[Vec3]): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Unit, quaternion: Unit, skinSize: Double): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Unit, quaternion: Quaternion): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Unit, quaternion: Quaternion, skinSize: Double): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3, quaternion: Unit, skinSize: Double): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3, quaternion: Quaternion): AABB = js.native
  def setFromPoints(points: js.Array[Vec3], position: Vec3, quaternion: Quaternion, skinSize: Double): AABB = js.native
  
  def toLocalFrame(frame: Transform, target: AABB): AABB = js.native
  
  def toWorldFrame(frame: Transform, target: AABB): AABB = js.native
  
  var upperBound: Vec3 = js.native
}
