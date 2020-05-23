package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayer extends TileLayer {
  def onhotspotclick(event: Content): Unit
}

object CustomLayer {
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean,
    onhotspotclick: Content => Unit
  ): CustomLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng), onhotspotclick = js.Any.fromFunction1(onhotspotclick))
    __obj.asInstanceOf[CustomLayer]
  }
}

