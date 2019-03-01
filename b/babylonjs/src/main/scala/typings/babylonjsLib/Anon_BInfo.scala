package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BInfo extends js.Object {
  var bInfo: js.UndefOr[js.Any] = js.undefined
  var bbSize: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var depthSort: js.UndefOr[scala.Boolean] = js.undefined
  var depthSortedFacets: js.UndefOr[js.Any] = js.undefined
  var distanceTo: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var facetNormals: js.UndefOr[js.Any] = js.undefined
  var facetPartitioning: js.UndefOr[js.Any] = js.undefined
  var facetPositions: js.UndefOr[js.Any] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var subDiv: js.UndefOr[js.Any] = js.undefined
  var useRightHandedSystem: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BInfo {
  @scala.inline
  def apply(
    bInfo: js.Any = null,
    bbSize: babylonjsLib.BABYLONNs.Vector3 = null,
    depthSort: js.UndefOr[scala.Boolean] = js.undefined,
    depthSortedFacets: js.Any = null,
    distanceTo: babylonjsLib.BABYLONNs.Vector3 = null,
    facetNormals: js.Any = null,
    facetPartitioning: js.Any = null,
    facetPositions: js.Any = null,
    ratio: scala.Int | scala.Double = null,
    subDiv: js.Any = null,
    useRightHandedSystem: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BInfo = {
    val __obj = js.Dynamic.literal()
    if (bInfo != null) __obj.updateDynamic("bInfo")(bInfo)
    if (bbSize != null) __obj.updateDynamic("bbSize")(bbSize)
    if (!js.isUndefined(depthSort)) __obj.updateDynamic("depthSort")(depthSort)
    if (depthSortedFacets != null) __obj.updateDynamic("depthSortedFacets")(depthSortedFacets)
    if (distanceTo != null) __obj.updateDynamic("distanceTo")(distanceTo)
    if (facetNormals != null) __obj.updateDynamic("facetNormals")(facetNormals)
    if (facetPartitioning != null) __obj.updateDynamic("facetPartitioning")(facetPartitioning)
    if (facetPositions != null) __obj.updateDynamic("facetPositions")(facetPositions)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (subDiv != null) __obj.updateDynamic("subDiv")(subDiv)
    if (!js.isUndefined(useRightHandedSystem)) __obj.updateDynamic("useRightHandedSystem")(useRightHandedSystem)
    __obj.asInstanceOf[Anon_BInfo]
  }
}

