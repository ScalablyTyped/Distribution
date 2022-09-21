package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.PointToPointConstraint")
@js.native
open class PointToPointConstraint protected ()
  extends StObject
     with typings.cannon.CANNON.Constraint {
  def this(
    bodyA: typings.cannon.CANNON.Body,
    pivotA: typings.cannon.CANNON.Vec3,
    bodyB: typings.cannon.CANNON.Body,
    pivotB: typings.cannon.CANNON.Vec3
  ) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    pivotA: typings.cannon.CANNON.Vec3,
    bodyB: typings.cannon.CANNON.Body,
    pivotB: typings.cannon.CANNON.Vec3,
    maxForce: Double
  ) = this()
  
  /* CompleteClass */
  var bodyA: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var collideConnected: Boolean = js.native
  
  /* CompleteClass */
  override def disable(): Unit = js.native
  
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[Any] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
