package typings.compareDashVersions.compareDashVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed arithmetic operators
  */
/* Rewritten from type alias, can be one of: 
  - typings.compareDashVersions.compareDashVersionsStrings.`>`
  - typings.compareDashVersions.compareDashVersionsStrings.`>=`
  - typings.compareDashVersions.compareDashVersionsStrings.`=`
  - typings.compareDashVersions.compareDashVersionsStrings.`<`
  - typings.compareDashVersions.compareDashVersionsStrings.`<=`
*/
trait CompareOperator extends js.Object

object CompareOperator {
  @scala.inline
  def `<`: typings.compareDashVersions.compareDashVersionsStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typings.compareDashVersions.compareDashVersionsStrings.`<=` = this.cast("<=")
  @scala.inline
  def `=`: typings.compareDashVersions.compareDashVersionsStrings.`=` = this.cast("=")
  @scala.inline
  def `>`: typings.compareDashVersions.compareDashVersionsStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typings.compareDashVersions.compareDashVersionsStrings.`>=` = this.cast(">=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

