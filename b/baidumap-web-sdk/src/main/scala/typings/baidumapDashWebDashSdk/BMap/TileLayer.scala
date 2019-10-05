package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.TileLayer")
@js.native
class TileLayer () extends js.Object {
  def this(opts: TileLayerOptions) = this()
  def getCopyright(): Copyright = js.native
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String = js.native
  def isTransparentPng(): Boolean = js.native
}

