package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxDegree extends js.Object {
  def maxDegree(): Double
}

object Anon_MaxDegree {
  @scala.inline
  def apply(maxDegree: () => Double): Anon_MaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
  
    __obj.asInstanceOf[Anon_MaxDegree]
  }
}

