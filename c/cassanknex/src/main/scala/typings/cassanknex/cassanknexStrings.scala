package typings.cassanknex

import typings.cassanknex.cassanknexMod.ComparisonRestriction
import typings.cassanknex.cassanknexMod.InRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cassanknexStrings {
  @js.native
  sealed trait `<` extends ComparisonRestriction
  
  @js.native
  sealed trait `<=` extends ComparisonRestriction
  
  @js.native
  sealed trait `=` extends ComparisonRestriction
  
  @js.native
  sealed trait `>` extends ComparisonRestriction
  
  @js.native
  sealed trait `>=` extends ComparisonRestriction
  
  @js.native
  sealed trait IN extends InRestriction
  
  @js.native
  sealed trait SelectAsClause extends js.Object
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait in_ extends InRestriction
  
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
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def SelectAsClause: SelectAsClause = "SelectAsClause".asInstanceOf[SelectAsClause]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def in_ : in_ = "in".asInstanceOf[in_]
}

