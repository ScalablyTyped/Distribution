package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Conditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionConditional extends StObject {
  
  var condition: Conditional[Any]
}
object ConditionConditional {
  
  inline def apply(condition: Conditional[Any]): ConditionConditional = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConditional]
  }
  
  extension [Self <: ConditionConditional](x: Self) {
    
    inline def setCondition(value: Conditional[Any]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
