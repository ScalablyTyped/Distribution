package typings.cannon.mod

import typings.cannon.CANNON.IConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Constraint")
@js.native
class Constraint protected ()
  extends StObject
     with typings.cannon.CANNON.Constraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, options: IConstraintOptions) = this()
  
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
