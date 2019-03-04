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
    fromColor: js.Function2[Color, scala.Double, stdLib.HTMLCanvasElement],
    fromMakiIconId: js.Function3[
      java.lang.String, 
      Color, 
      scala.Double, 
      stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement]
    ],
    fromText: js.Function3[java.lang.String, Color, scala.Double, stdLib.HTMLCanvasElement],
    fromUrl: js.Function3[
      java.lang.String, 
      Color, 
      scala.Double, 
      stdLib.HTMLCanvasElement | js.Promise[stdLib.HTMLCanvasElement]
    ]
  ): PinBuilder = {
    val __obj = js.Dynamic.literal(fromColor = fromColor, fromMakiIconId = fromMakiIconId, fromText = fromText, fromUrl = fromUrl)
  
    __obj.asInstanceOf[PinBuilder]
  }
}

