package typings.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorCommonInstance extends js.Object {
  /**
    * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
    * If k is not specified, it defaults to 1. The behavior of this method is dependent on the implementing color space.
    *
    * @param k A color space dependent number to determine, how much brighter the returned color should be.
    */
  def brighter(): this.type = js.native
  def brighter(k: Double): this.type = js.native
  /**
    * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
    * If k is not specified, it defaults to 1. The behavior of this method is dependent on the implementing color space.
    *
    * @param k A color space dependent number to determine, how much darker the returned color should be.
    */
  def darker(): this.type = js.native
  def darker(k: Double): this.type = js.native
  /**
    * Returns true if and only if the color is displayable on standard hardware.
    * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
    */
  def displayable(): Boolean = js.native
  /**
    * Returns a hexadecimal string representing this color.
    * If this color is not displayable, a suitable displayable color is returned instead.
    * For example, RGB channel values greater than 255 are clamped to 255.
    */
  def hex(): String = js.native
  /**
    * Returns the RGB equivalent of this color. For RGB colors, that’s "this".
    */
  def rgb(): RGBColor = js.native
}

