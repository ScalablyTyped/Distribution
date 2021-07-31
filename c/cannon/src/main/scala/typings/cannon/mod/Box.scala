package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends StObject
     with typings.cannon.CANNON.Box {
  def this(halfExtents: typings.cannon.CANNON.Vec3) = this()
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
/* static members */
object Box {
  
  @JSImport("cannon", "Box")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateInertia(halfExtents: typings.cannon.CANNON.Vec3, mass: Double, target: typings.cannon.CANNON.Vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInertia")(halfExtents.asInstanceOf[js.Any], mass.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
