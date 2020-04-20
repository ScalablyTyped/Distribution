package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDegree extends js.Object {
  def maxDegree(): Double
}

object AnonMaxDegree {
  @scala.inline
  def apply(maxDegree: () => Double): AnonMaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
    __obj.asInstanceOf[AnonMaxDegree]
  }
}

