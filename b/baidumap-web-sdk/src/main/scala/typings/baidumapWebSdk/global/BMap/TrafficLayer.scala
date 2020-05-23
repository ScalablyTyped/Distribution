package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import typings.baidumapWebSdk.BMap.TrafficLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.TrafficLayer")
@js.native
class TrafficLayer ()
  extends typings.baidumapWebSdk.BMap.TileLayer {
  def this(opts: TrafficLayerOptions) = this()
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}

