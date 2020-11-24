package typings.compareVersions

import typings.compareVersions.mod.CompareOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareVersionsStrings {
  
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait Equalssign extends CompareOperator
  
  @js.native
  sealed trait Greaterthansign extends CompareOperator
  
  @js.native
  sealed trait GreaterthansignEqualssign extends CompareOperator
  
  @js.native
  sealed trait Lessthansign extends CompareOperator
  
  @js.native
  sealed trait LessthansignEqualssign extends CompareOperator
}
