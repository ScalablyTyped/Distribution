package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import typings.baidumapWebSdk.BMap.CustomLayerOptions
import typings.baidumapWebSdk.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.CustomLayer")
@js.native
class CustomLayer protected ()
  extends typings.baidumapWebSdk.BMap.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}

