package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareOperator extends StObject
@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator with Double] = js.native
  
  @js.native
  sealed trait Equal extends CompareOperator
  /* 2 */ val Equal: typings.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
  
  @js.native
  sealed trait GreaterThan extends CompareOperator
  /* 5 */ val GreaterThan: typings.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
  
  @js.native
  sealed trait GreaterThanEqual extends CompareOperator
  /* 4 */ val GreaterThanEqual: typings.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
  
  @js.native
  sealed trait LessThan extends CompareOperator
  /* 0 */ val LessThan: typings.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
  
  @js.native
  sealed trait LessThanEqual extends CompareOperator
  /* 1 */ val LessThanEqual: typings.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
  
  @js.native
  sealed trait NotEqual extends CompareOperator
  /* 3 */ val NotEqual: typings.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
}
