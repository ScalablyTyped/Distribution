package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionFunction extends js.Object {
  var positionFunction: js.UndefOr[js.Any] = js.undefined
  var vertexFunction: js.UndefOr[js.Any] = js.undefined
}

object Anon_PositionFunction {
  @scala.inline
  def apply(positionFunction: js.Any = null, vertexFunction: js.Any = null): Anon_PositionFunction = {
    val __obj = js.Dynamic.literal()
    if (positionFunction != null) __obj.updateDynamic("positionFunction")(positionFunction)
    if (vertexFunction != null) __obj.updateDynamic("vertexFunction")(vertexFunction)
    __obj.asInstanceOf[Anon_PositionFunction]
  }
}

