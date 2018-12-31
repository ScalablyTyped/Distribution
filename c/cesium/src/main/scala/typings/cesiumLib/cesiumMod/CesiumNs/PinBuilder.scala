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

