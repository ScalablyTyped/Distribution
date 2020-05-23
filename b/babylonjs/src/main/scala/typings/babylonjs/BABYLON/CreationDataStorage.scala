package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreationDataStorage extends js.Object {
  var arc: Double
  var cap: Double
  var closeArray: js.UndefOr[Boolean] = js.undefined
  var closePath: js.UndefOr[Boolean] = js.undefined
  var dashSize: Double
  var gapSize: Double
  var idx: js.Array[Double]
  var path3D: Path3D
  var pathArray: js.Array[js.Array[Vector3]]
  var radius: Double
  var tessellation: Double
}

object CreationDataStorage {
  @scala.inline
  def apply(
    arc: Double,
    cap: Double,
    dashSize: Double,
    gapSize: Double,
    idx: js.Array[Double],
    path3D: Path3D,
    pathArray: js.Array[js.Array[Vector3]],
    radius: Double,
    tessellation: Double,
    closeArray: js.UndefOr[Boolean] = js.undefined,
    closePath: js.UndefOr[Boolean] = js.undefined
  ): CreationDataStorage = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], dashSize = dashSize.asInstanceOf[js.Any], gapSize = gapSize.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], path3D = path3D.asInstanceOf[js.Any], pathArray = pathArray.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
    if (!js.isUndefined(closeArray)) __obj.updateDynamic("closeArray")(closeArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closePath)) __obj.updateDynamic("closePath")(closePath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDataStorage]
  }
}

