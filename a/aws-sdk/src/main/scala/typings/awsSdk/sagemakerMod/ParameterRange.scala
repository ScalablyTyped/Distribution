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
  def apply(
    CategoricalParameterRangeSpecification: CategoricalParameterRangeSpecification = null,
    ContinuousParameterRangeSpecification: ContinuousParameterRangeSpecification = null,
    IntegerParameterRangeSpecification: IntegerParameterRangeSpecification = null
  ): ParameterRange = {
    val __obj = js.Dynamic.literal()
    if (CategoricalParameterRangeSpecification != null) __obj.updateDynamic("CategoricalParameterRangeSpecification")(CategoricalParameterRangeSpecification.asInstanceOf[js.Any])
    if (ContinuousParameterRangeSpecification != null) __obj.updateDynamic("ContinuousParameterRangeSpecification")(ContinuousParameterRangeSpecification.asInstanceOf[js.Any])
    if (IntegerParameterRangeSpecification != null) __obj.updateDynamic("IntegerParameterRangeSpecification")(IntegerParameterRangeSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRange]
  }
}

