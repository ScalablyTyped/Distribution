package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.RaycastResult")
@js.native
open class RaycastResult ()
  extends StObject
     with typings.cannon.CANNON.RaycastResult {
  
  /* CompleteClass */
  var body: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var distance: Double = js.native
  
  /* CompleteClass */
  var hasHit: Boolean = js.native
  
  /* CompleteClass */
  var hitNormalWorld: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var hitPointWorld: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rayFromWorld: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rayToWorld: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(
    rayFromWorld: typings.cannon.CANNON.Vec3,
    rayToWorld: typings.cannon.CANNON.Vec3,
    hitNormalWorld: typings.cannon.CANNON.Vec3,
    hitPointWorld: typings.cannon.CANNON.Vec3,
    shape: typings.cannon.CANNON.Shape,
    body: typings.cannon.CANNON.Body,
    distance: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var shape: typings.cannon.CANNON.Shape = js.native
}
