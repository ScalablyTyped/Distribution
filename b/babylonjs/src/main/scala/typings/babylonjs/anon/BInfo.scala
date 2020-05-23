package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BInfo extends js.Object {
  var bInfo: js.UndefOr[js.Any] = js.undefined
  var bbSize: js.UndefOr[Vector3] = js.undefined
  var depthSort: js.UndefOr[Boolean] = js.undefined
  var depthSortedFacets: js.UndefOr[js.Any] = js.undefined
  var distanceTo: js.UndefOr[Vector3] = js.undefined
  var facetNormals: js.UndefOr[js.Any] = js.undefined
  var facetPartitioning: js.UndefOr[js.Any] = js.undefined
  var facetPositions: js.UndefOr[js.Any] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var subDiv: js.UndefOr[js.Any] = js.undefined
  var useRightHandedSystem: js.UndefOr[Boolean] = js.undefined
}

object BInfo {
  @scala.inline
  def apply(
    bInfo: js.Any = null,
    bbSize: Vector3 = null,
    depthSort: js.UndefOr[Boolean] = js.undefined,
    depthSortedFacets: js.Any = null,
    distanceTo: Vector3 = null,
    facetNormals: js.Any = null,
    facetPartitioning: js.Any = null,
    facetPositions: js.Any = null,
    ratio: js.UndefOr[Double] = js.undefined,
    subDiv: js.Any = null,
    useRightHandedSystem: js.UndefOr[Boolean] = js.undefined
  ): BInfo = {
    val __obj = js.Dynamic.literal()
    if (bInfo != null) __obj.updateDynamic("bInfo")(bInfo.asInstanceOf[js.Any])
    if (bbSize != null) __obj.updateDynamic("bbSize")(bbSize.asInstanceOf[js.Any])
    if (!js.isUndefined(depthSort)) __obj.updateDynamic("depthSort")(depthSort.get.asInstanceOf[js.Any])
    if (depthSortedFacets != null) __obj.updateDynamic("depthSortedFacets")(depthSortedFacets.asInstanceOf[js.Any])
    if (distanceTo != null) __obj.updateDynamic("distanceTo")(distanceTo.asInstanceOf[js.Any])
    if (facetNormals != null) __obj.updateDynamic("facetNormals")(facetNormals.asInstanceOf[js.Any])
    if (facetPartitioning != null) __obj.updateDynamic("facetPartitioning")(facetPartitioning.asInstanceOf[js.Any])
    if (facetPositions != null) __obj.updateDynamic("facetPositions")(facetPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (subDiv != null) __obj.updateDynamic("subDiv")(subDiv.asInstanceOf[js.Any])
    if (!js.isUndefined(useRightHandedSystem)) __obj.updateDynamic("useRightHandedSystem")(useRightHandedSystem.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BInfo]
  }
}

