package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRange extends js.Object {
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.CategoricalParameterRangeSpecification] = js.native
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.ContinuousParameterRangeSpecification] = js.native
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.IntegerParameterRangeSpecification] = js.native
}

object ParameterRange {
  @scala.inline
  def apply(): ParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRange]
  }
  @scala.inline
  implicit class ParameterRangeOps[Self <: ParameterRange] (val x: Self) extends AnyVal {
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
    def setCategoricalParameterRangeSpecification(value: CategoricalParameterRangeSpecification): Self = this.set("CategoricalParameterRangeSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalParameterRangeSpecification: Self = this.set("CategoricalParameterRangeSpecification", js.undefined)
    @scala.inline
    def setContinuousParameterRangeSpecification(value: ContinuousParameterRangeSpecification): Self = this.set("ContinuousParameterRangeSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousParameterRangeSpecification: Self = this.set("ContinuousParameterRangeSpecification", js.undefined)
    @scala.inline
    def setIntegerParameterRangeSpecification(value: IntegerParameterRangeSpecification): Self = this.set("IntegerParameterRangeSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerParameterRangeSpecification: Self = this.set("IntegerParameterRangeSpecification", js.undefined)
  }
  
}

