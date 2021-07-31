package typings.cannon.mod

import typings.cannon.CANNON.ISpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Spring")
@js.native
class Spring ()
  extends StObject
     with typings.cannon.CANNON.Spring {
  def this(options: ISpringOptions) = this()
  
  /* CompleteClass */
  override def applyForce(): Unit = js.native
  
  /* CompleteClass */
  var bodyA: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var damping: Double = js.native
  
  /* CompleteClass */
  override def getWorldAnchorA(result: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getWorldAnchorB(result: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var localAnchorA: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var localAnchorB: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var restLength: Double = js.native
  
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var stffness: Double = js.native
}
