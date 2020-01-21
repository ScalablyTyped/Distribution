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
  def apply(
    algorithmHyperParameterRanges: HyperParameterRanges = null,
    hpoObjective: HPOObjective = null,
    hpoResourceConfig: HPOResourceConfig = null
  ): HPOConfig = {
    val __obj = js.Dynamic.literal()
    if (algorithmHyperParameterRanges != null) __obj.updateDynamic("algorithmHyperParameterRanges")(algorithmHyperParameterRanges.asInstanceOf[js.Any])
    if (hpoObjective != null) __obj.updateDynamic("hpoObjective")(hpoObjective.asInstanceOf[js.Any])
    if (hpoResourceConfig != null) __obj.updateDynamic("hpoResourceConfig")(hpoResourceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPOConfig]
  }
}

