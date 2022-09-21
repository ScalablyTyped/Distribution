package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Conditional
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ValueDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ValueDef<any> & {  condition :.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Conditional<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ValueDef<any>> | std.Array<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.Conditional<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ValueDef<any>>>} */
trait ValueDefanyconditionCondi extends StObject {
  
  var condition: Conditional[ValueDef[Any]] | js.Array[Conditional[ValueDef[Any]]]
  
  /**
    * A constant value in visual domain (e.g., `"red"` / `"#0099ff"` / [gradient definition](https://vega.github.io/vega-lite/docs/types.html#gradient) for color, values between `0` to `1` for opacity).
    */
  var value: Any
}
object ValueDefanyconditionCondi {
  
  inline def apply(condition: Conditional[ValueDef[Any]] | js.Array[Conditional[ValueDef[Any]]], value: Any): ValueDefanyconditionCondi = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefanyconditionCondi]
  }
  
  extension [Self <: ValueDefanyconditionCondi](x: Self) {
    
    inline def setCondition(value: Conditional[ValueDef[Any]] | js.Array[Conditional[ValueDef[Any]]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionVarargs(value: Conditional[ValueDef[Any]]*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
