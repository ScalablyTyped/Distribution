package typings.ddTrace

import typings.ddTrace.mod.SamplingRule
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRateLimit extends js.Object {
  /**
    * Global rate limit that is applied on the global sample rate and all rules.
    * @default 100
    */
  var rateLimit: js.UndefOr[Number] = js.undefined
  /**
    * Sampling rules to apply to priority sampling.
    * @default []
    */
  var rules: js.UndefOr[js.Array[SamplingRule]] = js.undefined
  /**
    * Sample rate to apply globally when no other rule is matched. Omit to fallback on the dynamic rates returned by the agent instead.
    */
  var sampleRate: js.UndefOr[Number] = js.undefined
}

object AnonRateLimit {
  @scala.inline
  def apply(rateLimit: Number = null, rules: js.Array[SamplingRule] = null, sampleRate: Number = null): AnonRateLimit = {
    val __obj = js.Dynamic.literal()
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRateLimit]
  }
}

