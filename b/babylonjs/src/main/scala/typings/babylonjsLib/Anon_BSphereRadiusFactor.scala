package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BSphereRadiusFactor extends js.Object {
  var bSphereRadiusFactor: js.UndefOr[scala.Double] = js.undefined
  var boundingSphereOnly: js.UndefOr[scala.Boolean] = js.undefined
  var enableDepthSort: js.UndefOr[scala.Boolean] = js.undefined
  var isPickable: js.UndefOr[scala.Boolean] = js.undefined
  var particleIntersection: js.UndefOr[scala.Boolean] = js.undefined
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BSphereRadiusFactor {
  @scala.inline
  def apply(
    bSphereRadiusFactor: scala.Int | scala.Double = null,
    boundingSphereOnly: js.UndefOr[scala.Boolean] = js.undefined,
    enableDepthSort: js.UndefOr[scala.Boolean] = js.undefined,
    isPickable: js.UndefOr[scala.Boolean] = js.undefined,
    particleIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    if (bSphereRadiusFactor != null) __obj.updateDynamic("bSphereRadiusFactor")(bSphereRadiusFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(boundingSphereOnly)) __obj.updateDynamic("boundingSphereOnly")(boundingSphereOnly)
    if (!js.isUndefined(enableDepthSort)) __obj.updateDynamic("enableDepthSort")(enableDepthSort)
    if (!js.isUndefined(isPickable)) __obj.updateDynamic("isPickable")(isPickable)
    if (!js.isUndefined(particleIntersection)) __obj.updateDynamic("particleIntersection")(particleIntersection)
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_BSphereRadiusFactor]
  }
}

