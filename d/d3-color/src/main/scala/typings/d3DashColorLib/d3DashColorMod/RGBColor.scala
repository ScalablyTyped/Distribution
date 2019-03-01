package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColor
  extends Color
     with ColorSpaceObject {
  /**
    * Value of blue channel
    */
  var b: scala.Double = js.native
  /**
    * Value of green channel
    */
  var g: scala.Double = js.native
  /**
    * Opacity value
    */
  var opacity: scala.Double = js.native
  /**
    * Value of red channel
    */
  var r: scala.Double = js.native
  /**
    * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much brighter the returned color should be.
    */
  def brighter(): this.type = js.native
  def brighter(k: scala.Double): this.type = js.native
  /**
    * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much darker the returned color should be.
    */
  def darker(): this.type = js.native
  def darker(k: scala.Double): this.type = js.native
  /**
    * Returns the RGB equivalent of this color.
    */
  def rgb(): this.type = js.native
}

