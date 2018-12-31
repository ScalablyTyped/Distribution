package typings
package colornamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Name extends js.Object {
  /**
    * Provides the functionality to resolve `css`-colors.
    */
  var css: colornamesLib.colornamesMod.ColorResolver = js.native
  /**
    * Provides the functionality to resolve `vga`-colors.
    */
  var vga: colornamesLib.colornamesMod.ColorResolver = js.native
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
}

