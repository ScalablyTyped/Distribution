package typings.compareVersions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed arithmetic operators
  */
/* Rewritten from type alias, can be one of: 
  - typings.compareVersions.compareVersionsStrings.Greaterthansign
  - typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
  - typings.compareVersions.compareVersionsStrings.Equalssign
  - typings.compareVersions.compareVersionsStrings.Lessthansign
  - typings.compareVersions.compareVersionsStrings.LessthansignEqualssign
*/
trait CompareOperator extends js.Object

object CompareOperator {
  @scala.inline
  def Equalssign: typings.compareVersions.compareVersionsStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.compareVersions.compareVersionsStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.compareVersions.compareVersionsStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.compareVersions.compareVersionsStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

