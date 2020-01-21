package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalParameterRangeSpecification extends js.Object {
  /**
    * The allowed categories for the hyperparameter.
    */
  var Values: ParameterValues = js.native
}

object CategoricalParameterRangeSpecification {
  @scala.inline
  def apply(Values: ParameterValues): CategoricalParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoricalParameterRangeSpecification]
  }
}

