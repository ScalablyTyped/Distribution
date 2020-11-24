package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParameterRange extends js.Object {
  
  /**
    * The maximum tunable value of the hyperparameter.
    */
  var MaxValue: Integer = js.native
  
  /**
    * The minimum tunable value of the hyperparameter.
    */
  var MinValue: Integer = js.native
  
  /**
    * The name of the hyperparameter to tune.
    */
  var Name: typings.awsSdk.forecastserviceMod.Name = js.native
  
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. Valid values:  Auto  Amazon Forecast hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have values greater than 0.  ReverseLogarithmic  Not supported for IntegerParameterRange. Reverse logarithmic scaling works only for ranges that are entirely within the range 0 &lt;= x &lt; 1.0.   For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:
    */
  var ScalingType: js.UndefOr[typings.awsSdk.forecastserviceMod.ScalingType] = js.native
}
object IntegerParameterRange {
  
  @scala.inline
  def apply(MaxValue: Integer, MinValue: Integer, Name: Name): IntegerParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRange]
  }
  
  @scala.inline
  implicit class IntegerParameterRangeOps[Self <: IntegerParameterRange] (val x: Self) extends AnyVal {
    
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
    def setMaxValue(value: Integer): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Integer): Self = this.set("MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingType(value: ScalingType): Self = this.set("ScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingType: Self = this.set("ScalingType", js.undefined)
  }
}
