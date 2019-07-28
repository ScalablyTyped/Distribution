package typings.d3DashHsv.d3DashHsvMod

import typings.d3DashColor.d3DashColorMod.Color
import typings.d3DashColor.d3DashColorMod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSVColor extends Color {
  /**
    * The color hue.
    */
  var h: Double = js.native
  /**
    * The color opacity.
    */
  var opacity: Double = js.native
  /**
    * The color saturation.
    */
  var s: Double = js.native
  /**
    * The color value.
    */
  var v: Double = js.native
  /**
    * Returns a brighter copy of this color.
    * @param k Controls how much brighter the returned color should be (defaults to 1).
    */
  def brighter(): this.type = js.native
  def brighter(k: Double): this.type = js.native
  /**
    * Returns a darker copy of this color.
    * @param k Controls how much darker the returned color should be (defaults to 1).
    */
  def darker(): this.type = js.native
  def darker(k: Double): this.type = js.native
  /**
    * Returns the RGB equivalent of this color.
    */
  def rgb(): RGBColor = js.native
}

