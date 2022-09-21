package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.logicalDTsMod.LogicalComposition
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.Predicate
import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit
import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnitParams
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite8ozrbXDH.transformDTsMod.AggregateTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.BinTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.CalculateTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.DensityTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.FilterTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.FlattenTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.FoldTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.ImputeTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.JoinAggregateTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.LoessTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.LookupTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.QuantileTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.RegressionTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.TimeUnitTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.SampleTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.StackTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.WindowTransform
  - typings.vegaLite8ozrbXDH.transformDTsMod.PivotTransform
*/
trait Transform extends StObject
object Transform {
  
  inline def AggregateTransform(aggregate: js.Array[AggregatedFieldDef]): typings.vegaLite8ozrbXDH.transformDTsMod.AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.AggregateTransform]
  }
  
  inline def BinTransform(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.BinTransform]
  }
  
  inline def CalculateTransform(as: FieldName, calculate: String): typings.vegaLite8ozrbXDH.transformDTsMod.CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.CalculateTransform]
  }
  
  inline def DensityTransform(density: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.DensityTransform]
  }
  
  inline def FilterTransform(filter: LogicalComposition[Predicate]): typings.vegaLite8ozrbXDH.transformDTsMod.FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.FilterTransform]
  }
  
  inline def FlattenTransform(flatten: js.Array[FieldName]): typings.vegaLite8ozrbXDH.transformDTsMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.FlattenTransform]
  }
  
  inline def FoldTransform(fold: js.Array[FieldName]): typings.vegaLite8ozrbXDH.transformDTsMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.FoldTransform]
  }
  
  inline def ImputeTransform(impute: FieldName, key: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.ImputeTransform]
  }
  
  inline def JoinAggregateTransform(joinaggregate: js.Array[JoinAggregateFieldDef]): typings.vegaLite8ozrbXDH.transformDTsMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.JoinAggregateTransform]
  }
  
  inline def LoessTransform(loess: FieldName, on: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.LoessTransform = {
    val __obj = js.Dynamic.literal(loess = loess.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.LoessTransform]
  }
  
  inline def LookupTransform(from: LookupData | LookupSelection, lookup: String): typings.vegaLite8ozrbXDH.transformDTsMod.LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.LookupTransform]
  }
  
  inline def PivotTransform(pivot: FieldName, value: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.PivotTransform]
  }
  
  inline def QuantileTransform(quantile: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.QuantileTransform]
  }
  
  inline def RegressionTransform(on: FieldName, regression: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], regression = regression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.RegressionTransform]
  }
  
  inline def SampleTransform(sample: Double): typings.vegaLite8ozrbXDH.transformDTsMod.SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.SampleTransform]
  }
  
  inline def StackTransform(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): typings.vegaLite8ozrbXDH.transformDTsMod.StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.StackTransform]
  }
  
  inline def TimeUnitTransform(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): typings.vegaLite8ozrbXDH.transformDTsMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.TimeUnitTransform]
  }
  
  inline def WindowTransform(window: js.Array[WindowFieldDef]): typings.vegaLite8ozrbXDH.transformDTsMod.WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.transformDTsMod.WindowTransform]
  }
}
