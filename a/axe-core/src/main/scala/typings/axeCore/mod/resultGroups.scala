package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.inapplicable
  - typings.axeCore.axeCoreStrings.passes
  - typings.axeCore.axeCoreStrings.incomplete
  - typings.axeCore.axeCoreStrings.violations
*/
trait resultGroups extends js.Object

object resultGroups {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inapplicable: typings.axeCore.axeCoreStrings.inapplicable = this.cast("inapplicable")
  @scala.inline
  def incomplete: typings.axeCore.axeCoreStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def passes: typings.axeCore.axeCoreStrings.passes = this.cast("passes")
  @scala.inline
  def violations: typings.axeCore.axeCoreStrings.violations = this.cast("violations")
}

