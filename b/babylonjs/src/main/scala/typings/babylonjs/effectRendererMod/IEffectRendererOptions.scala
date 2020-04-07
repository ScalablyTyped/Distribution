package typings.babylonjs.effectRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffectRendererOptions extends js.Object {
  /**
    * Defines the indices.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Defines the vertices positions.
    */
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
}

object IEffectRendererOptions {
  @scala.inline
  def apply(indices: js.Array[Double] = null, positions: js.Array[Double] = null): IEffectRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectRendererOptions]
  }
}

