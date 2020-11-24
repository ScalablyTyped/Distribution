package typings.cassanknex

import typings.cassanknex.mod.ComparisonRestriction
import typings.cassanknex.mod.InRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cassanknexStrings {
  
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @scala.inline
  def SelectAsClause: SelectAsClause = "SelectAsClause".asInstanceOf[SelectAsClause]
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait Equalssign extends ComparisonRestriction
  
  @js.native
  sealed trait Greaterthansign extends ComparisonRestriction
  
  @js.native
  sealed trait GreaterthansignEqualssign extends ComparisonRestriction
  
  @js.native
  sealed trait IN extends InRestriction
  
  @js.native
  sealed trait Lessthansign extends ComparisonRestriction
  
  @js.native
  sealed trait LessthansignEqualssign extends ComparisonRestriction
  
  @js.native
  sealed trait SelectAsClause extends js.Object
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait in_ extends InRestriction
}
