package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayer extends js.Object {
  def getCopyright(): Copyright
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String
  def isTransparentPng(): Boolean
}

object TileLayer {
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng))
    __obj.asInstanceOf[TileLayer]
  }
}

