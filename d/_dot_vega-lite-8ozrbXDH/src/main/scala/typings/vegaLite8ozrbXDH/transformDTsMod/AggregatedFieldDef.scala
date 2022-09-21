package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedFieldDef extends StObject {
  
  /**
    * The output field names to use for each aggregated field.
    */
  var as: FieldName
  
  /**
    * The data field for which to compute aggregate function. This is required for all aggregation operations except `"count"`.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The aggregation operation to apply to the fields (e.g., `"sum"`, `"average"`, or `"count"`).
    * See the [full list of supported aggregation operations](https://vega.github.io/vega-lite/docs/aggregate.html#ops)
    * for more information.
    */
  var op: AggregateOp
}
object AggregatedFieldDef {
  
  inline def apply(as: FieldName, op: AggregateOp): AggregatedFieldDef = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedFieldDef]
  }
  
  extension [Self <: AggregatedFieldDef](x: Self) {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: AggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
