package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForecastRequest extends StObject {
  
  /**
    * A name for the forecast.
    */
  var ForecastName: Name
  
  /**
    * The quantiles at which probabilistic forecasts are generated. You can currently specify up to 5 quantiles per forecast. Accepted values include 0.01 to 0.99 (increments of .01 only) and mean. The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta and Negative Binomial). The default value is ["0.1", "0.5", "0.9"].
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastTypes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
    */
  var PredictorArn: Arn
  
  /**
    * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.undefined
}
object CreateForecastRequest {
  
  inline def apply(ForecastName: Name, PredictorArn: Arn): CreateForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastName = ForecastName.asInstanceOf[js.Any], PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastRequest]
  }
  
  extension [Self <: CreateForecastRequest](x: Self) {
    
    inline def setForecastName(value: Name): Self = StObject.set(x, "ForecastName", value.asInstanceOf[js.Any])
    
    inline def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    inline def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    inline def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value :_*))
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
