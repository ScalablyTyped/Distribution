package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxDegree extends js.Object {
  def maxDegree(): Double
}

object MaxDegree {
  @scala.inline
  def apply(maxDegree: () => Double): MaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
    __obj.asInstanceOf[MaxDegree]
  }
}

