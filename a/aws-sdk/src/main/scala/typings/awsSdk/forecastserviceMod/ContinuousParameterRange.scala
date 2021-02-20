package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousParameterRange extends StObject {
  
  /**
    * The maximum tunable value of the hyperparameter.
    */
  var MaxValue: Double = js.native
  
  /**
    * The minimum tunable value of the hyperparameter.
    */
  var MinValue: Double = js.native
  
  /**
    * The name of the hyperparameter to tune.
    */
  var Name: typings.awsSdk.forecastserviceMod.Name = js.native
  
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. Valid values:  Auto  Amazon Forecast hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have values greater than 0.  ReverseLogarithmic  hyperparameter tuning searches the values in the hyperparameter range by using a reverse logarithmic scale. Reverse logarithmic scaling works only for ranges that are entirely within the range 0 &lt;= x &lt; 1.0.   For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:
    */
  var ScalingType: js.UndefOr[typings.awsSdk.forecastserviceMod.ScalingType] = js.native
}
object ContinuousParameterRange {
  
  @scala.inline
  def apply(MaxValue: Double, MinValue: Double, Name: Name): ContinuousParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRange]
  }
  
  @scala.inline
  implicit class ContinuousParameterRangeMutableBuilder[Self <: ContinuousParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingType(value: ScalingType): Self = StObject.set(x, "ScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingTypeUndefined: Self = StObject.set(x, "ScalingType", js.undefined)
  }
}
