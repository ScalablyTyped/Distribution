package typings.d3DashHexbin.d3DashHexbinMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexbinBin[T] extends Array[T] {
  /**
    * The x-coordinate of the center of the associated bin’s hexagon.
    */
  var x: Double = js.native
  /**
    * The y-coordinate of the center of the associated bin’s hexagon.
    */
  var y: Double = js.native
}

