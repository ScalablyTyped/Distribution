package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetricSetRequest extends StObject {
  
  /**
    * Describes a list of filters for choosing specific dimensions and specific values. Each filter consists of the dimension and one of its values that you want to include. When multiple dimensions or values are specified, the dimensions are joined with an AND operation and the values are joined with an OR operation.
    */
  var DimensionFilterList: js.UndefOr[MetricSetDimensionFilterList] = js.undefined
  
  /**
    * The dimension list.
    */
  var DimensionList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DimensionList] = js.undefined
  
  /**
    * The metric list.
    */
  var MetricList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.MetricList] = js.undefined
  
  /**
    * The ARN of the dataset to update.
    */
  var MetricSetArn: Arn
  
  /**
    * The dataset's description.
    */
  var MetricSetDescription: js.UndefOr[typings.awsSdk.lookoutmetricsMod.MetricSetDescription] = js.undefined
  
  /**
    * The dataset's interval.
    */
  var MetricSetFrequency: js.UndefOr[Frequency] = js.undefined
  
  var MetricSource: js.UndefOr[typings.awsSdk.lookoutmetricsMod.MetricSource] = js.undefined
  
  /**
    * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only supported for S3, Redshift, Athena and datasources.
    */
  var Offset: js.UndefOr[typings.awsSdk.lookoutmetricsMod.Offset] = js.undefined
  
  /**
    * The timestamp column.
    */
  var TimestampColumn: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TimestampColumn] = js.undefined
}
object UpdateMetricSetRequest {
  
  inline def apply(MetricSetArn: Arn): UpdateMetricSetRequest = {
    val __obj = js.Dynamic.literal(MetricSetArn = MetricSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetricSetRequest]
  }
  
  extension [Self <: UpdateMetricSetRequest](x: Self) {
    
    inline def setDimensionFilterList(value: MetricSetDimensionFilterList): Self = StObject.set(x, "DimensionFilterList", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterListUndefined: Self = StObject.set(x, "DimensionFilterList", js.undefined)
    
    inline def setDimensionFilterListVarargs(value: MetricSetDimensionFilter*): Self = StObject.set(x, "DimensionFilterList", js.Array(value*))
    
    inline def setDimensionList(value: DimensionList): Self = StObject.set(x, "DimensionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionListUndefined: Self = StObject.set(x, "DimensionList", js.undefined)
    
    inline def setDimensionListVarargs(value: ColumnName*): Self = StObject.set(x, "DimensionList", js.Array(value*))
    
    inline def setMetricList(value: MetricList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    inline def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
    
    inline def setMetricListVarargs(value: Metric*): Self = StObject.set(x, "MetricList", js.Array(value*))
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDescription(value: MetricSetDescription): Self = StObject.set(x, "MetricSetDescription", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDescriptionUndefined: Self = StObject.set(x, "MetricSetDescription", js.undefined)
    
    inline def setMetricSetFrequency(value: Frequency): Self = StObject.set(x, "MetricSetFrequency", value.asInstanceOf[js.Any])
    
    inline def setMetricSetFrequencyUndefined: Self = StObject.set(x, "MetricSetFrequency", js.undefined)
    
    inline def setMetricSource(value: MetricSource): Self = StObject.set(x, "MetricSource", value.asInstanceOf[js.Any])
    
    inline def setMetricSourceUndefined: Self = StObject.set(x, "MetricSource", js.undefined)
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    inline def setTimestampColumn(value: TimestampColumn): Self = StObject.set(x, "TimestampColumn", value.asInstanceOf[js.Any])
    
    inline def setTimestampColumnUndefined: Self = StObject.set(x, "TimestampColumn", js.undefined)
  }
}
