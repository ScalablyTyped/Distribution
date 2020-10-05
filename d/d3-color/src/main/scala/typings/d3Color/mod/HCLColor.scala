package typings.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HCLColor
  extends Color_
     with ColorSpaceObject {
  /**
    * Chroma channel value typically in [0, 230].
    */
  var c: Double = js.native
  /**
    * Hue channel value typically in [0, 360).
    */
  var h: Double = js.native
  /**
    * Luminance channel value typically in the range [0, 100].
    */
  var l: Double = js.native
  /**
    * Opacity value
    */
  var opacity: Double = js.native
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

