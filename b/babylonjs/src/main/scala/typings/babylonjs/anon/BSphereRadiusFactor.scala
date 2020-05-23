package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BSphereRadiusFactor extends js.Object {
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

object BSphereRadiusFactor {
  @scala.inline
  def apply(
    bSphereRadiusFactor: js.UndefOr[Double] = js.undefined,
    boundingSphereOnly: js.UndefOr[Boolean] = js.undefined,
    enableDepthSort: js.UndefOr[Boolean] = js.undefined,
    enableMultiMaterial: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    isPickable: js.UndefOr[Boolean] = js.undefined,
    particleIntersection: js.UndefOr[Boolean] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useModelMaterial: js.UndefOr[Boolean] = js.undefined
  ): BSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bSphereRadiusFactor)) __obj.updateDynamic("bSphereRadiusFactor")(bSphereRadiusFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundingSphereOnly)) __obj.updateDynamic("boundingSphereOnly")(boundingSphereOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDepthSort)) __obj.updateDynamic("enableDepthSort")(enableDepthSort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiMaterial)) __obj.updateDynamic("enableMultiMaterial")(enableMultiMaterial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPickable)) __obj.updateDynamic("isPickable")(isPickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(particleIntersection)) __obj.updateDynamic("particleIntersection")(particleIntersection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useModelMaterial)) __obj.updateDynamic("useModelMaterial")(useModelMaterial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSphereRadiusFactor]
  }
}

