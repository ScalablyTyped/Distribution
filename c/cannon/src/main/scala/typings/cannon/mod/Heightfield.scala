package typings.cannon.mod

import typings.cannon.CANNON.IHightfield
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Heightfield")
@js.native
class Heightfield protected ()
  extends typings.cannon.CANNON.Heightfield {
  def this(data: js.Array[Double]) = this()
  def this(data: js.Array[Double], options: IHightfield) = this()
}

