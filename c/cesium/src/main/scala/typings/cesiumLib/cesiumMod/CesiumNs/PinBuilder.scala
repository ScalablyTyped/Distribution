package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinBuilder extends js.Object {
  def fromColor(color: Color, size: scala.Double): stdLib.HTMLCanvasElement
  def fromMakiIconId(id: java.lang.String, color: Color, size: scala.Double): stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement]
  def fromText(text: java.lang.String, color: Color, size: scala.Double): stdLib.HTMLCanvasElement
  def fromUrl(url: java.lang.String, color: Color, size: scala.Double): stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement]
}

object PinBuilder {
  @scala.inline
  def apply(
    fromColor: (Color, scala.Double) => stdLib.HTMLCanvasElement,
    fromMakiIconId: (java.lang.String, Color, scala.Double) => stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement],
    fromText: (java.lang.String, Color, scala.Double) => stdLib.HTMLCanvasElement,
    fromUrl: (java.lang.String, Color, scala.Double) => stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement]
  ): PinBuilder = {
    val __obj = js.Dynamic.literal(fromColor = js.Any.fromFunction2(fromColor), fromMakiIconId = js.Any.fromFunction3(fromMakiIconId), fromText = js.Any.fromFunction3(fromText), fromUrl = js.Any.fromFunction3(fromUrl))
  
    __obj.asInstanceOf[PinBuilder]
  }
}

