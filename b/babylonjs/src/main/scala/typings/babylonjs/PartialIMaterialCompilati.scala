package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IMaterialCompilationOptions> */
trait PartialIMaterialCompilati extends js.Object {
  var clipPlane: js.UndefOr[Boolean] = js.undefined
  var useInstances: js.UndefOr[Boolean] = js.undefined
}

object PartialIMaterialCompilati {
  @scala.inline
  def apply(clipPlane: js.UndefOr[Boolean] = js.undefined, useInstances: js.UndefOr[Boolean] = js.undefined): PartialIMaterialCompilati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clipPlane)) __obj.updateDynamic("clipPlane")(clipPlane.asInstanceOf[js.Any])
    if (!js.isUndefined(useInstances)) __obj.updateDynamic("useInstances")(useInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIMaterialCompilati]
  }
}

