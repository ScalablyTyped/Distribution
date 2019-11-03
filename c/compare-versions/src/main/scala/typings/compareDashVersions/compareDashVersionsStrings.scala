package typings.compareDashVersions

import typings.compareDashVersions.compareDashVersionsMod.CompareOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object compareDashVersionsStrings {
  @js.native
  sealed trait `<` extends CompareOperator
  
  @js.native
  sealed trait `<=` extends CompareOperator
  
  @js.native
  sealed trait `=` extends CompareOperator
  
  @js.native
  sealed trait `>` extends CompareOperator
  
  @js.native
  sealed trait `>=` extends CompareOperator
  
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `=`: `=` = "=".asInstanceOf[`=`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
}

