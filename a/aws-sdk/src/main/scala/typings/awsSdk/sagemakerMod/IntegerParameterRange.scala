package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParameterRange extends js.Object {
  
  /**
    * The maximum value of the hyperparameter to search.
    */
  var MaxValue: ParameterValue = js.native
  
  /**
    * The minimum value of the hyperparameter to search.
    */
  var MinValue: ParameterValue = js.native
  
  /**
    * The name of the hyperparameter to search.
    */
  var Name: ParameterKey = js.native
  
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  
    */
  var ScalingType: js.UndefOr[HyperParameterScalingType] = js.native
}
object IntegerParameterRange {
  
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue, Name: ParameterKey): IntegerParameterRange = {
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
    def setMaxValue(value: ParameterValue): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: ParameterValue): Self = this.set("MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ParameterKey): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingType(value: HyperParameterScalingType): Self = this.set("ScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingType: Self = this.set("ScalingType", js.undefined)
  }
}
