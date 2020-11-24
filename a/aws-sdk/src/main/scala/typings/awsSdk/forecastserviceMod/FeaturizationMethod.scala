package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturizationMethod extends js.Object {
  
  /**
    * The name of the method. The "filling" method is the only supported method.
    */
  var FeaturizationMethodName: typings.awsSdk.forecastserviceMod.FeaturizationMethodName = js.native
  
  /**
    * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to override the default values. Related Time Series attributes do not accept aggregation parameters. The following list shows the parameters and their valid values for the "filling" featurization method for a Target Time Series dataset. Bold signifies the default value.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number), value, median, mean, min, max     backfill: zero, nan, value, median, mean, min, max    The following list shows the parameters and their valid values for a Related Time Series featurization method (there are no defaults):    middlefill: zero, value, median, mean, min, max     backfill: zero, value, median, mean, min, max     futurefill: zero, value, median, mean, min, max    To set a filling method to a specific value, set the fill parameter to value and define the value in a corresponding _value parameter. For example, to set backfilling to a value of 2, include the following: "backfill": "value" and "backfill_value":"2". 
    */
  var FeaturizationMethodParameters: js.UndefOr[typings.awsSdk.forecastserviceMod.FeaturizationMethodParameters] = js.native
}
object FeaturizationMethod {
  
  @scala.inline
  def apply(FeaturizationMethodName: FeaturizationMethodName): FeaturizationMethod = {
    val __obj = js.Dynamic.literal(FeaturizationMethodName = FeaturizationMethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationMethod]
  }
  
  @scala.inline
  implicit class FeaturizationMethodOps[Self <: FeaturizationMethod] (val x: Self) extends AnyVal {
    
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
    def setFeaturizationMethodName(value: FeaturizationMethodName): Self = this.set("FeaturizationMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturizationMethodParameters(value: FeaturizationMethodParameters): Self = this.set("FeaturizationMethodParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturizationMethodParameters: Self = this.set("FeaturizationMethodParameters", js.undefined)
  }
}
