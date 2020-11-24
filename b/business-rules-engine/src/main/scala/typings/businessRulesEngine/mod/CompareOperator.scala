package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareOperator extends js.Object
@JSImport("business-rules-engine", "CompareOperator")
@js.native
object CompareOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompareOperator with Double] = js.native
  
  @js.native
  sealed trait Equal extends CompareOperator
  /* 2 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  @js.native
  sealed trait GreaterThan extends CompareOperator
  /* 5 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  @js.native
  sealed trait GreaterThanEqual extends CompareOperator
  /* 4 */ @js.native
  object GreaterThanEqual extends TopLevel[GreaterThanEqual with Double]
  
  @js.native
  sealed trait LessThan extends CompareOperator
  /* 0 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  @js.native
  sealed trait LessThanEqual extends CompareOperator
  /* 1 */ @js.native
  object LessThanEqual extends TopLevel[LessThanEqual with Double]
  
  @js.native
  sealed trait NotEqual extends CompareOperator
  /* 3 */ @js.native
  object NotEqual extends TopLevel[NotEqual with Double]
}
