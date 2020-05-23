package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RaycastResult")
@js.native
class RaycastResult ()
  extends typings.cannon.CANNON.RaycastResult {
  /* CompleteClass */
  override var body: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var distance: Double = js.native
  /* CompleteClass */
  override var hasHit: Boolean = js.native
  /* CompleteClass */
  override var hitNormalWorld: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var hitPointWorld: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rayFromWorld: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rayToWorld: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var shape: typings.cannon.CANNON.Shape = js.native
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
}

