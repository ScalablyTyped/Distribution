package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWhatIfForecastRequest extends StObject {
  
  /**
    * A list of tags to apply to the what if forecast.
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.undefined
  
  /**
    * The replacement time series dataset, which contains the rows that you want to change in the related time series dataset. A replacement time series does not need to contain all rows that are in the baseline related time series. Include only the rows (measure-dimension combinations) that you want to include in the what-if forecast. This dataset is merged with the original time series to create a transformed dataset that is used for the what-if analysis. This dataset should contain the items to modify (such as item_id or workforce_type), any relevant dimensions, the timestamp column, and at least one of the related time series columns. This file should not contain duplicate timestamps for the same time series. Timestamps and item_ids not included in this dataset are not included in the what-if analysis. 
    */
  var TimeSeriesReplacementsDataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.TimeSeriesReplacementsDataSource] = js.undefined
  
  /**
    * The transformations that are applied to the baseline time series. Each transformation contains an action and a set of conditions. An action is applied only when all conditions are met. If no conditions are provided, the action is applied to all items.
    */
  var TimeSeriesTransformations: js.UndefOr[typings.awsSdk.forecastserviceMod.TimeSeriesTransformations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis.
    */
  var WhatIfAnalysisArn: Arn
  
  /**
    * The name of the what-if forecast. Names must be unique within each what-if analysis.
    */
  var WhatIfForecastName: Name
}
object CreateWhatIfForecastRequest {
  
  inline def apply(WhatIfAnalysisArn: Arn, WhatIfForecastName: Name): CreateWhatIfForecastRequest = {
    val __obj = js.Dynamic.literal(WhatIfAnalysisArn = WhatIfAnalysisArn.asInstanceOf[js.Any], WhatIfForecastName = WhatIfForecastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWhatIfForecastRequest]
  }
  
  extension [Self <: CreateWhatIfForecastRequest](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeSeriesReplacementsDataSource(value: TimeSeriesReplacementsDataSource): Self = StObject.set(x, "TimeSeriesReplacementsDataSource", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesReplacementsDataSourceUndefined: Self = StObject.set(x, "TimeSeriesReplacementsDataSource", js.undefined)
    
    inline def setTimeSeriesTransformations(value: TimeSeriesTransformations): Self = StObject.set(x, "TimeSeriesTransformations", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesTransformationsUndefined: Self = StObject.set(x, "TimeSeriesTransformations", js.undefined)
    
    inline def setTimeSeriesTransformationsVarargs(value: TimeSeriesTransformation*): Self = StObject.set(x, "TimeSeriesTransformations", js.Array(value*))
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastName(value: Name): Self = StObject.set(x, "WhatIfForecastName", value.asInstanceOf[js.Any])
  }
}
