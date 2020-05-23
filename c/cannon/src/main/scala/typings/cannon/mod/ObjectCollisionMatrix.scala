package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ObjectCollisionMatrix")
@js.native
class ObjectCollisionMatrix ()
  extends typings.cannon.CANNON.ObjectCollisionMatrix {
  /* CompleteClass */
  override var matrix: js.Array[Double] = js.native
  /* CompleteClass */
  override def get(i: Double, j: Double): Double = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def set(i: Double, j: Double, value: Double): Unit = js.native
  /* CompleteClass */
  override def setNumObjects(n: Double): Unit = js.native
}

