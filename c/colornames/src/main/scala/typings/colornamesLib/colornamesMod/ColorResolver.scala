package typings
package colornamesLib.colornamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Povides the functionality to resolve colors of a specific type by its name.
  */
@js.native
trait ColorResolver extends js.Object {
  /**
    * Gets all colors.
    */
  def apply(): js.Array[Color] = js.native
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  def apply(name: java.lang.String): Color = js.native
}

