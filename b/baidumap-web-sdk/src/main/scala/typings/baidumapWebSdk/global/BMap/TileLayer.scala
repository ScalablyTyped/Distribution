package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import typings.baidumapWebSdk.BMap.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.TileLayer")
@js.native
class TileLayer ()
  extends typings.baidumapWebSdk.BMap.TileLayer {
  def this(opts: TileLayerOptions) = this()
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}

