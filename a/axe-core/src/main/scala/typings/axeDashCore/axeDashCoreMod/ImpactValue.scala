package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axeDashCore.axeDashCoreStrings.minor
  - typings.axeDashCore.axeDashCoreStrings.moderate
  - typings.axeDashCore.axeDashCoreStrings.serious
  - typings.axeDashCore.axeDashCoreStrings.critical
*/
trait ImpactValue extends js.Object

object ImpactValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.axeDashCore.axeDashCoreStrings.critical = this.cast("critical")
  @scala.inline
  def minor: typings.axeDashCore.axeDashCoreStrings.minor = this.cast("minor")
  @scala.inline
  def moderate: typings.axeDashCore.axeDashCoreStrings.moderate = this.cast("moderate")
  @scala.inline
  def serious: typings.axeDashCore.axeDashCoreStrings.serious = this.cast("serious")
}

