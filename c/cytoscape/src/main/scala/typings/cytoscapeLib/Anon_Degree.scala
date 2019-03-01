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
  def apply(degree: js.Function0[scala.Double]): Anon_Degree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(degree)
    __obj.asInstanceOf[Anon_Degree]
  }
}

