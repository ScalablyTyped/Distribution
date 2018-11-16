package typings
package d3DashHsvLib.d3DashHsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSVColor
  extends d3DashColorLib.d3DashColorMod.Color {
  /**
       * The color hue.
       */
  var h: scala.Double = js.native
  /**
       * The color opacity.
       */
  var opacity: scala.Double = js.native
  /**
       * The color saturation.
       */
  var s: scala.Double = js.native
  /**
       * The color value.
       */
  var v: scala.Double = js.native
  /**
       * Returns a brighter copy of this color.
       * @param k Controls how much brighter the returned color should be (defaults to 1).
       */
  def brighter(): this.type = js.native
  /**
       * Returns a brighter copy of this color.
       * @param k Controls how much brighter the returned color should be (defaults to 1).
       */
  def brighter(k: scala.Double): this.type = js.native
  /**
       * Returns a darker copy of this color.
       * @param k Controls how much darker the returned color should be (defaults to 1).
       */
  def darker(): this.type = js.native
  /**
       * Returns a darker copy of this color.
       * @param k Controls how much darker the returned color should be (defaults to 1).
       */
  def darker(k: scala.Double): this.type = js.native
  /**
       * Returns the RGB equivalent of this color.
       */
  def rgb(): d3DashColorLib.d3DashColorMod.RGBColor = js.native
}

