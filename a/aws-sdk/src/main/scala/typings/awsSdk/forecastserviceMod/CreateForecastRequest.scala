package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateForecastRequest extends js.Object {
  
  /**
    * A name for the forecast.
    */
  var ForecastName: Name = js.native
  
  /**
    * The quantiles at which probabilistic forecasts are generated. You can currently specify up to 5 quantiles per forecast. Accepted values include 0.01 to 0.99 (increments of .01 only) and mean. The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta and Negative Binomial). The default value is ["0.1", "0.5", "0.9"].
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastTypes] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
    */
  var PredictorArn: Arn = js.native
  
  /**
    * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.native
}
object CreateForecastRequest {
  
  @scala.inline
  def apply(ForecastName: Name, PredictorArn: Arn): CreateForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastName = ForecastName.asInstanceOf[js.Any], PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastRequest]
  }
  
  @scala.inline
  implicit class CreateForecastRequestOps[Self <: CreateForecastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForecastName(value: Name): Self = this.set("ForecastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorArn(value: Arn): Self = this.set("PredictorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastTypesVarargs(value: ForecastType*): Self = this.set("ForecastTypes", js.Array(value :_*))
    
    @scala.inline
    def setForecastTypes(value: ForecastTypes): Self = this.set("ForecastTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastTypes: Self = this.set("ForecastTypes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
