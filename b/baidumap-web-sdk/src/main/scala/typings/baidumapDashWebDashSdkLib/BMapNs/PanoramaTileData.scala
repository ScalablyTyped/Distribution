package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaTileData extends js.Object {
  var centerHeading: scala.Double
  var tileSize: Size
  var worldSize: Size
}

object PanoramaTileData {
  @scala.inline
  def apply(centerHeading: scala.Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("centerHeading")(centerHeading)
    __obj.updateDynamic("tileSize")(tileSize)
    __obj.updateDynamic("worldSize")(worldSize)
    __obj.asInstanceOf[PanoramaTileData]
  }
}

