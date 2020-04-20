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
  def Equalssign: typings.compareVersions.compareVersionsStrings.Equalssign = "=".asInstanceOf[typings.compareVersions.compareVersionsStrings.Equalssign]
  @scala.inline
  def Greaterthansign: typings.compareVersions.compareVersionsStrings.Greaterthansign = ">".asInstanceOf[typings.compareVersions.compareVersionsStrings.Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.compareVersions.compareVersionsStrings.GreaterthansignEqualssign]
  @scala.inline
  def Lessthansign: typings.compareVersions.compareVersionsStrings.Lessthansign = "<".asInstanceOf[typings.compareVersions.compareVersionsStrings.Lessthansign]
  @scala.inline
  def LessthansignEqualssign: typings.compareVersions.compareVersionsStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.compareVersions.compareVersionsStrings.LessthansignEqualssign]
}

