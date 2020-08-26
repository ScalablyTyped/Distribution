package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalParameterRange extends js.Object {
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: ParameterKey = js.native
  /**
    * A list of the categories for the hyperparameter.
    */
  var Values: ParameterValues = js.native
}

object CategoricalParameterRange {
  @scala.inline
  def apply(Name: ParameterKey, Values: ParameterValues): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRange]
  }
  @scala.inline
  implicit class CategoricalParameterRangeOps[Self <: CategoricalParameterRange] (val x: Self) extends AnyVal {
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
    def setName(value: ParameterKey): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ParameterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ParameterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

