package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompareOperator extends js.Object

@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends js.Object {
  @js.native
  sealed trait Equal
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  @js.native
  sealed trait GreaterThan
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  @js.native
  sealed trait GreaterThanEqual
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  @js.native
  sealed trait LessThan
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  @js.native
  sealed trait LessThanEqual
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  @js.native
  sealed trait NotEqual
    extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator
  
  /* 2 */ val Equal: Equal with scala.Double = js.native
  /* 5 */ val GreaterThan: GreaterThan with scala.Double = js.native
  /* 4 */ val GreaterThanEqual: GreaterThanEqual with scala.Double = js.native
  /* 0 */ val LessThan: LessThan with scala.Double = js.native
  /* 1 */ val LessThanEqual: LessThanEqual with scala.Double = js.native
  /* 3 */ val NotEqual: NotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.CompareOperator with scala.Double
  ] = js.native
}

