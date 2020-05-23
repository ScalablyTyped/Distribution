package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Degree extends js.Object {
  def degree(): Double
}

object Degree {
  @scala.inline
  def apply(degree: () => Double): Degree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
    __obj.asInstanceOf[Degree]
  }
}

