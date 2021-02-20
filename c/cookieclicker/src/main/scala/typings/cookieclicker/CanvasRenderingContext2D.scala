package typings.cookieclicker

import typings.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2D extends StObject {
  
  /**
    * Fills a pattern of images
    * @param img The image to use
    * @param X  X of the top left corner of the pattern
    * @param Y Y of the top left corner of the pattern
    * @param W Width of the pattern
    * @param H Height of the pattern
    * @param iW Width of the image
    * @param iH Height of the image
    * @param offX X offset of the images
    * @param offY Y offset of the images
    */
  def fillPattern(img: CanvasImageSource, X: Double, Y: Double, W: Double, H: Double, iW: Double, iH: Double): Unit = js.native
  def fillPattern(
    img: CanvasImageSource,
    X: Double,
    Y: Double,
    W: Double,
    H: Double,
    iW: Double,
    iH: Double,
    offX: js.UndefOr[scala.Nothing],
    offY: Double
  ): Unit = js.native
  def fillPattern(
    img: CanvasImageSource,
    X: Double,
    Y: Double,
    W: Double,
    H: Double,
    iW: Double,
    iH: Double,
    offX: Double
  ): Unit = js.native
  def fillPattern(
    img: CanvasImageSource,
    X: Double,
    Y: Double,
    W: Double,
    H: Double,
    iW: Double,
    iH: Double,
    offX: Double,
    offY: Double
  ): Unit = js.native
}
