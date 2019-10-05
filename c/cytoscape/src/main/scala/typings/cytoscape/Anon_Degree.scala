package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Degree extends js.Object {
  def degree(): Double
}

object Anon_Degree {
  @scala.inline
  def apply(degree: () => Double): Anon_Degree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
  
    __obj.asInstanceOf[Anon_Degree]
  }
}

