package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.axeCoreStrings.wcag2a
  - typings.axeCore.axeCoreStrings.wcag2aa
  - typings.axeCore.axeCoreStrings.section508
  - typings.axeCore.axeCoreStrings.`best-practice`
*/
trait TagValue extends js.Object

object TagValue {
  @scala.inline
  def `best-practice`: typings.axeCore.axeCoreStrings.`best-practice` = this.cast("best-practice")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def section508: typings.axeCore.axeCoreStrings.section508 = this.cast("section508")
  @scala.inline
  def wcag2a: typings.axeCore.axeCoreStrings.wcag2a = this.cast("wcag2a")
  @scala.inline
  def wcag2aa: typings.axeCore.axeCoreStrings.wcag2aa = this.cast("wcag2aa")
}

