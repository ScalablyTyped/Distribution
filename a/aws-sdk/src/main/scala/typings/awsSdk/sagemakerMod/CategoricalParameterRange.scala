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
}

