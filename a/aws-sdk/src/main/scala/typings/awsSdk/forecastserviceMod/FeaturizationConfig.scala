package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturizationConfig extends js.Object {
  
  /**
    * An array of featurization (transformation) information for the fields of a dataset.
    */
  var Featurizations: js.UndefOr[typings.awsSdk.forecastserviceMod.Featurizations] = js.native
  
  /**
    * An array of dimension (field) names that specify how to group the generated forecast. For example, suppose that you are generating a forecast for item sales across all of your stores, and your dataset contains a store_id field. If you want the sales forecast for each item by store, you would specify store_id as the dimension. All forecast dimensions specified in the TARGET_TIME_SERIES dataset don't need to be specified in the CreatePredictor request. All forecast dimensions specified in the RELATED_TIME_SERIES dataset must be specified in the CreatePredictor request.
    */
  var ForecastDimensions: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastDimensions] = js.native
  
  /**
    * The frequency of predictions in a forecast. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min" indicates every five minutes. The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency. When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset frequency.
    */
  var ForecastFrequency: Frequency = js.native
}
object FeaturizationConfig {
  
  @scala.inline
  def apply(ForecastFrequency: Frequency): FeaturizationConfig = {
    val __obj = js.Dynamic.literal(ForecastFrequency = ForecastFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationConfig]
  }
  
  @scala.inline
  implicit class FeaturizationConfigOps[Self <: FeaturizationConfig] (val x: Self) extends AnyVal {
    
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
    def setForecastFrequency(value: Frequency): Self = this.set("ForecastFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturizationsVarargs(value: Featurization*): Self = this.set("Featurizations", js.Array(value :_*))
    
    @scala.inline
    def setFeaturizations(value: Featurizations): Self = this.set("Featurizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturizations: Self = this.set("Featurizations", js.undefined)
    
    @scala.inline
    def setForecastDimensionsVarargs(value: Name*): Self = this.set("ForecastDimensions", js.Array(value :_*))
    
    @scala.inline
    def setForecastDimensions(value: ForecastDimensions): Self = this.set("ForecastDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastDimensions: Self = this.set("ForecastDimensions", js.undefined)
  }
}
