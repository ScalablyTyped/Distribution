package typings
package d3DashHexbinLib.d3DashHexbinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexbinBin[T]
  extends stdLib.Array[T] {
  /**
    * The x-coordinate of the center of the associated bin’s hexagon.
    */
  var x: scala.Double = js.native
  /**
    * The y-coordinate of the center of the associated bin’s hexagon.
    */
  var y: scala.Double = js.native
}

