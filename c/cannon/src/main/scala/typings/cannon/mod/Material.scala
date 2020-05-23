package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Material")
@js.native
class Material protected ()
  extends typings.cannon.CANNON.Material {
  def this(name: String) = this()
  /* CompleteClass */
  override var friction: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var restitution: Double = js.native
}

