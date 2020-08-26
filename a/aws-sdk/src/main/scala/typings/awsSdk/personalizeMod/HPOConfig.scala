package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOConfig extends js.Object {
  /**
    * The hyperparameters and their allowable ranges.
    */
  var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.native
  /**
    * The metric to optimize during HPO.
    */
  var hpoObjective: js.UndefOr[HPOObjective] = js.native
  /**
    * Describes the resource configuration for HPO.
    */
  var hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.native
}

object HPOConfig {
  @scala.inline
  def apply(): HPOConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOConfig]
  }
  @scala.inline
  implicit class HPOConfigOps[Self <: HPOConfig] (val x: Self) extends AnyVal {
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
    def setAlgorithmHyperParameterRanges(value: HyperParameterRanges): Self = this.set("algorithmHyperParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmHyperParameterRanges: Self = this.set("algorithmHyperParameterRanges", js.undefined)
    @scala.inline
    def setHpoObjective(value: HPOObjective): Self = this.set("hpoObjective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpoObjective: Self = this.set("hpoObjective", js.undefined)
    @scala.inline
    def setHpoResourceConfig(value: HPOResourceConfig): Self = this.set("hpoResourceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpoResourceConfig: Self = this.set("hpoResourceConfig", js.undefined)
  }
  
}

