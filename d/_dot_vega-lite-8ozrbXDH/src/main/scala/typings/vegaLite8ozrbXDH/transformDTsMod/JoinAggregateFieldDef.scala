package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinAggregateFieldDef extends StObject {
  
  /**
    * The output name for the join aggregate operation.
    */
  var as: FieldName
  
  /**
    * The data field for which to compute the aggregate function. This can be omitted for functions that do not operate over a field such as `"count"`.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The aggregation operation to apply (e.g., `"sum"`, `"average"` or `"count"`). See the list of all supported operations [here](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
    */
  var op: AggregateOp
}
object JoinAggregateFieldDef {
  
  inline def apply(as: FieldName, op: AggregateOp): JoinAggregateFieldDef = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinAggregateFieldDef]
  }
  
  extension [Self <: JoinAggregateFieldDef](x: Self) {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: AggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
