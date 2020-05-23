package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaCoverageLayer")
@js.native
class PanoramaCoverageLayer ()
  extends typings.baidumapWebSdk.BMap.TileLayer {
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}

