package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.minor
  - typings.axeCore.axeCoreStrings.moderate
  - typings.axeCore.axeCoreStrings.serious
  - typings.axeCore.axeCoreStrings.critical
*/
trait ImpactValue extends js.Object

object ImpactValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.axeCore.axeCoreStrings.critical = this.cast("critical")
  @scala.inline
  def minor: typings.axeCore.axeCoreStrings.minor = this.cast("minor")
  @scala.inline
  def moderate: typings.axeCore.axeCoreStrings.moderate = this.cast("moderate")
  @scala.inline
  def serious: typings.axeCore.axeCoreStrings.serious = this.cast("serious")
}

