package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBSphereRadiusFactor extends js.Object {
  var bSphereRadiusFactor: js.UndefOr[Double] = js.undefined
  var boundingSphereOnly: js.UndefOr[Boolean] = js.undefined
  var enableDepthSort: js.UndefOr[Boolean] = js.undefined
  var enableMultiMaterial: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var isPickable: js.UndefOr[Boolean] = js.undefined
  var particleIntersection: js.UndefOr[Boolean] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useModelMaterial: js.UndefOr[Boolean] = js.undefined
}

object AnonBSphereRadiusFactor {
  @scala.inline
  def apply(
    bSphereRadiusFactor: Int | Double = null,
    boundingSphereOnly: js.UndefOr[Boolean] = js.undefined,
    enableDepthSort: js.UndefOr[Boolean] = js.undefined,
    enableMultiMaterial: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    isPickable: js.UndefOr[Boolean] = js.undefined,
    particleIntersection: js.UndefOr[Boolean] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useModelMaterial: js.UndefOr[Boolean] = js.undefined
  ): AnonBSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    if (bSphereRadiusFactor != null) __obj.updateDynamic("bSphereRadiusFactor")(bSphereRadiusFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(boundingSphereOnly)) __obj.updateDynamic("boundingSphereOnly")(boundingSphereOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDepthSort)) __obj.updateDynamic("enableDepthSort")(enableDepthSort.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiMaterial)) __obj.updateDynamic("enableMultiMaterial")(enableMultiMaterial.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(isPickable)) __obj.updateDynamic("isPickable")(isPickable.asInstanceOf[js.Any])
    if (!js.isUndefined(particleIntersection)) __obj.updateDynamic("particleIntersection")(particleIntersection.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (!js.isUndefined(useModelMaterial)) __obj.updateDynamic("useModelMaterial")(useModelMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBSphereRadiusFactor]
  }
}

