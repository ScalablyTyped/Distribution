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
  def apply(): TunedHPOParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunedHPOParams]
  }
  @scala.inline
  implicit class TunedHPOParamsOps[Self <: TunedHPOParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithmHyperParameters(value: HyperParameters): Self = this.set("algorithmHyperParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmHyperParameters: Self = this.set("algorithmHyperParameters", js.undefined)
  }
  
}

