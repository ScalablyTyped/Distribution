package typings
package colornamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_All extends js.Object {
  /**
    * Provides the functionality to resolve `css`-colors.
    */
  @JSName("css")
  var css_Original: colornamesLib.colornamesMod.ColorResolver = js.native
  /**
    * Provides the functionality to resolve `vga`-colors.
    */
  @JSName("vga")
  var vga_Original: colornamesLib.colornamesMod.ColorResolver = js.native
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  def apply(name: java.lang.String): colornamesLib.colornamesMod.Color = js.native
  /**
    * Gets all available colors.
    */
  def all(): js.Array[colornamesLib.colornamesMod.Color] = js.native
  /**
    * Gets all colors.
    */
  /**
    * Provides the functionality to resolve `css`-colors.
    */
  def css(): js.Array[colornamesLib.colornamesMod.Color] = js.native
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  /**
    * Provides the functionality to resolve `css`-colors.
    */
  def css(name: java.lang.String): colornamesLib.colornamesMod.Color = js.native
  /**
    * Gets all colors.
    */
  /**
    * Provides the functionality to resolve `vga`-colors.
    */
  def vga(): js.Array[colornamesLib.colornamesMod.Color] = js.native
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  /**
    * Provides the functionality to resolve `vga`-colors.
    */
  def vga(name: java.lang.String): colornamesLib.colornamesMod.Color = js.native
}

