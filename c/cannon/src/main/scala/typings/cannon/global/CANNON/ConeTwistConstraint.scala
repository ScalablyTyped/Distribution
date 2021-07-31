package typings.cannon.global.CANNON

import typings.cannon.CANNON.IConeTwistConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected ()
  extends StObject
     with typings.cannon.CANNON.Constraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: IConeTwistConstraintOptions
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
  var equations: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
