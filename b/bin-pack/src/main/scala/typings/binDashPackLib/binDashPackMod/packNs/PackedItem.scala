package typings
package binDashPackLib.binDashPackMod.packNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the location of a packed bin. */
trait PackedItem[T] extends js.Object {
  /** Height of the bin. */
  var height: scala.Double
  /** The original bin object. */
  var item: T
  /** Width of the bin. */
  var width: scala.Double
  /** X coordinate of the packed bin. */
  var x: scala.Double
  /** Y coordinate of the packed bin. */
  var y: scala.Double
}

