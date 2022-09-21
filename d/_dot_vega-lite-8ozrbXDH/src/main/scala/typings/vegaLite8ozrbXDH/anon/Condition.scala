package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.ConditionalPredicate
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ValueDef
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition[V /* <: (typings.vegaLite8ozrbXDH.channeldefDTsMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
}
object Condition {
  
  inline def apply[V /* <: (typings.vegaLite8ozrbXDH.channeldefDTsMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](
    condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
  ): Condition[V, ES] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition[V, ES]]
  }
  
  extension [Self <: Condition[?, ?], V /* <: (typings.vegaLite8ozrbXDH.channeldefDTsMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](x: Self & (Condition[V, ES])) {
    
    inline def setCondition(
      value: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionVarargs(value: (ConditionalPredicate[ValueDef[V] | ES])*): Self = StObject.set(x, "condition", js.Array(value*))
  }
}
