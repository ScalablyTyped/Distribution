package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDegree extends js.Object {
  def degree(): Double
}

object AnonDegree {
  @scala.inline
  def apply(degree: () => Double): AnonDegree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
  
    __obj.asInstanceOf[AnonDegree]
  }
}

