package typings.d3Color.mod

import typings.d3Color.anon.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabColor
  extends Color_
     with ColorSpaceObject {
  
  /**
    * Position between red/magenta and green typically in [-160, +160].
    */
  var a: Double = js.native
  
  /**
    * Position between yellow and blue typically in [-160, +160].
    */
  var b: Double = js.native
  
  /**
    * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much brighter the returned color should be.
    */
  def brighter(): this.type = js.native
  def brighter(k: Double): this.type = js.native
  
  /**
    * Returns a copy of this color.
    *
    * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
    */
  def copy(): this.type = js.native
  def copy(values: A): this.type = js.native
  
  /**
    * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much darker the returned color should be.
    */
  def darker(): this.type = js.native
  def darker(k: Double): this.type = js.native
  
  /**
    * Lightness typically in the range [0, 100].
    */
  var l: Double = js.native
  
  /**
    * Opacity value
    */
  var opacity: Double = js.native
  
  /**
    * Returns the RGB color equivalent of this color.
    */
  def rgb(): RGBColor = js.native
}
