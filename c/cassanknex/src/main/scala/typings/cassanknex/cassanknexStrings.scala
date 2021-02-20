package typings.cassanknex

import typings.cassanknex.mod.ComparisonRestriction
import typings.cassanknex.mod.InRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cassanknexStrings {
  
  @js.native
  sealed trait Equalssign extends ComparisonRestriction
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait Greaterthansign extends ComparisonRestriction
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign extends ComparisonRestriction
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait IN extends InRestriction
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait Lessthansign extends ComparisonRestriction
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign extends ComparisonRestriction
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait SelectAsClause extends StObject
  @scala.inline
  def SelectAsClause: SelectAsClause = "SelectAsClause".asInstanceOf[SelectAsClause]
  
  @js.native
  sealed trait asc extends StObject
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait desc extends StObject
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait in_ extends InRestriction
  @scala.inline
  def in_ : in_ = "in".asInstanceOf[in_]
}
