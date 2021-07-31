package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Ray")
@js.native
class Ray ()
  extends StObject
     with typings.cannon.CANNON.Ray {
  def this(from: typings.cannon.CANNON.Vec3) = this()
  def this(from: Unit, to: typings.cannon.CANNON.Vec3) = this()
  def this(from: typings.cannon.CANNON.Vec3, to: typings.cannon.CANNON.Vec3) = this()
  
  /* CompleteClass */
  var checkCollisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var from: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getAABB(result: typings.cannon.CANNON.RaycastResult): Unit = js.native
  
  /* CompleteClass */
  var precision: Double = js.native
  
  /* CompleteClass */
  var to: typings.cannon.CANNON.Vec3 = js.native
}
