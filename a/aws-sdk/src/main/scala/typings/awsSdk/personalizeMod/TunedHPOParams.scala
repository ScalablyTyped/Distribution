package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TunedHPOParams extends js.Object {
  /**
    * A list of the hyperparameter values of the best performing model.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
}

object TunedHPOParams {
  @scala.inline
  def apply(algorithmHyperParameters: HyperParameters = null): TunedHPOParams = {
    val __obj = js.Dynamic.literal()
    if (algorithmHyperParameters != null) __obj.updateDynamic("algorithmHyperParameters")(algorithmHyperParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TunedHPOParams]
  }
}

