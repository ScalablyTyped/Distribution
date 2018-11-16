package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCLColor extends Color {
  /**
       * Chroma channel value typically in [0, 230].
       */
  var c: scala.Double = js.native
  /**
       * Hue channel value typically in [0, 360).
       */
  var h: scala.Double = js.native
  /**
       * Luminance channel value typically in the range [0, 100].
       */
  var l: scala.Double = js.native
  /**
       * Opacity value
       */
  var opacity: scala.Double = js.native
  /**
       * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
       * If k is not specified, it defaults to 1.
       *
       * @param k A color space dependent number to determine, how much brighter the returned color should be.
       */
  def brighter(): this.type = js.native
  /**
       * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
       * If k is not specified, it defaults to 1.
       *
       * @param k A color space dependent number to determine, how much brighter the returned color should be.
       */
  def brighter(k: scala.Double): this.type = js.native
  /**
       * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
       * If k is not specified, it defaults to 1.
       *
       * @param k A color space dependent number to determine, how much darker the returned color should be.
       */
  def darker(): this.type = js.native
  /**
       * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
       * If k is not specified, it defaults to 1.
       *
       * @param k A color space dependent number to determine, how much darker the returned color should be.
       */
  def darker(k: scala.Double): this.type = js.native
  /**
       * Returns the RGB color equivalent of this color.
       */
  def rgb(): RGBColor = js.native
}

