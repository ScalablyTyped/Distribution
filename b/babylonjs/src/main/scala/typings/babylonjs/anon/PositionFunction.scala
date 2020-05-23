package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionFunction extends js.Object {
  var positionFunction: js.UndefOr[js.Any] = js.undefined
  var storage: js.UndefOr[js.Array[js.Any]] = js.undefined
  var vertexFunction: js.UndefOr[js.Any] = js.undefined
}

object PositionFunction {
  @scala.inline
  def apply(positionFunction: js.Any = null, storage: js.Array[js.Any] = null, vertexFunction: js.Any = null): PositionFunction = {
    val __obj = js.Dynamic.literal()
    if (positionFunction != null) __obj.updateDynamic("positionFunction")(positionFunction.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (vertexFunction != null) __obj.updateDynamic("vertexFunction")(vertexFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionFunction]
  }
}

