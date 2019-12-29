package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompareOperator extends js.Object

@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends js.Object {
  @js.native
  sealed trait Equal extends CompareOperator
  
  @js.native
  sealed trait GreaterThan extends CompareOperator
  
  @js.native
  sealed trait GreaterThanEqual extends CompareOperator
  
  @js.native
  sealed trait LessThan extends CompareOperator
  
  @js.native
  sealed trait LessThanEqual extends CompareOperator
  
  @js.native
  sealed trait NotEqual extends CompareOperator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator with Double] = js.native
  /* 2 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  /* 5 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  /* 4 */ @js.native
  object GreaterThanEqual extends TopLevel[GreaterThanEqual with Double]
  
  /* 0 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  /* 1 */ @js.native
  object LessThanEqual extends TopLevel[LessThanEqual with Double]
  
  /* 3 */ @js.native
  object NotEqual extends TopLevel[NotEqual with Double]
  
}

