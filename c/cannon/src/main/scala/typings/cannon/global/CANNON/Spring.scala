package typings.cannon.global.CANNON

import typings.cannon.CANNON.ISpringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Spring")
@js.native
class Spring ()
  extends typings.cannon.CANNON.Spring {
  def this(options: ISpringOptions) = this()
  /* CompleteClass */
  override var bodyA: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bodyB: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var damping: Double = js.native
  /* CompleteClass */
  override var localAnchorA: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var localAnchorB: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var restLength: Double = js.native
  /* CompleteClass */
  override var stffness: Double = js.native
  /* CompleteClass */
  override def applyForce(): Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorA(result: typings.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorB(result: typings.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: typings.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: typings.cannon.CANNON.Vec3): Unit = js.native
}

