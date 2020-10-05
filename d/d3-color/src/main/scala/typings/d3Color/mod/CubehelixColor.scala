package typings.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubehelixColor
  extends Color_
     with ColorSpaceObject {
  /**
    * Hue channel value.
    */
  var h: Double = js.native
  /**
    * Lightness channel value.
    */
  var l: Double = js.native
  /**
    * Opacity value.
    */
  var opacity: Double = js.native
  /**
    * Saturation channel value.
    */
  var s: Double = js.native
  /**
    * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much brighter the returned color should be.
    */
  def brighter(): this.type = js.native
  def brighter(k: Double): this.type = js.native
  /**
    * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much darker the returned color should be.
    */
  def darker(): this.type = js.native
  def darker(k: Double): this.type = js.native
  /**
    * Returns the RGB color equivalent of this color.
    */
  def rgb(): RGBColor = js.native
}

