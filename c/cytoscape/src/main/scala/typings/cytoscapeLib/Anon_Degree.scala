package typings
package cytoscapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Degree extends js.Object {
  def degree(): scala.Double
}

object Anon_Degree {
  @scala.inline
  def apply(degree: () => scala.Double): Anon_Degree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
  
    __obj.asInstanceOf[Anon_Degree]
  }
}

