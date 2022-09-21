package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Plane")
@js.native
open class Plane ()
  extends StObject
     with typings.cannon.CANNON.Plane {
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def calculateWorldAABB(pos: typings.cannon.CANNON.Vec3, quat: typings.cannon.CANNON.Quaternion, min: Double, max: Double): Unit = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeWorldNormal(quat: typings.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
  
  /* CompleteClass */
  var worldNormal: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var worldNormalNeedsUpdate: Boolean = js.native
}
