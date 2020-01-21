package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaTileData extends js.Object {
  var centerHeading: Double
  var tileSize: Size
  var worldSize: Size
}

object PanoramaTileData {
  @scala.inline
  def apply(centerHeading: Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PanoramaTileData]
  }
}

