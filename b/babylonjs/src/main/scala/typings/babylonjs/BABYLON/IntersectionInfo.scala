package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionInfo extends js.Object {
  var bu: Nullable[Double]
  var bv: Nullable[Double]
  var distance: Double
  var faceId: Double
  var subMeshId: Double
}

object IntersectionInfo {
  @scala.inline
  def apply(
    distance: Double,
    faceId: Double,
    subMeshId: Double,
    bu: Nullable[Double] = null.asInstanceOf[Nullable[Double]],
    bv: Nullable[Double] = null.asInstanceOf[Nullable[Double]]
  ): IntersectionInfo = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], subMeshId = subMeshId.asInstanceOf[js.Any], bu = bu.asInstanceOf[js.Any], bv = bv.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionInfo]
  }
}

