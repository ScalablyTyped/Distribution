package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.metric
  - typings.convertUnits.convertUnitsStrings.imperial
  - typings.convertUnits.convertUnitsStrings.bits
  - typings.convertUnits.convertUnitsStrings.bytes
*/
trait system extends js.Object

object system {
  @scala.inline
  def bits: typings.convertUnits.convertUnitsStrings.bits = this.cast("bits")
  @scala.inline
  def bytes: typings.convertUnits.convertUnitsStrings.bytes = this.cast("bytes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typings.convertUnits.convertUnitsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typings.convertUnits.convertUnitsStrings.metric = this.cast("metric")
}

