package typings.compareDashVersions.compareDashVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed arithmetic operators
  */
/* Rewritten from type alias, can be one of: 
  - typings.compareDashVersions.compareDashVersionsStrings.Greaterthansign
  - typings.compareDashVersions.compareDashVersionsStrings.GreaterthansignEqualssign
  - typings.compareDashVersions.compareDashVersionsStrings.Equalssign
  - typings.compareDashVersions.compareDashVersionsStrings.Lessthansign
  - typings.compareDashVersions.compareDashVersionsStrings.LessthansignEqualssign
*/
trait CompareOperator extends js.Object

object CompareOperator {
  @scala.inline
  def Equalssign: typings.compareDashVersions.compareDashVersionsStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.compareDashVersions.compareDashVersionsStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.compareDashVersions.compareDashVersionsStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.compareDashVersions.compareDashVersionsStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.compareDashVersions.compareDashVersionsStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

