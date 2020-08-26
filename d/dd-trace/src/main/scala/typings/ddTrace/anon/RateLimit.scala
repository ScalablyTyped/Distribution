package typings.ddTrace.anon

import typings.ddTrace.mod.SamplingRule
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimit extends js.Object {
  /**
    * Global rate limit that is applied on the global sample rate and all rules.
    * @default 100
    */
  var rateLimit: js.UndefOr[Number] = js.native
  /**
    * Sampling rules to apply to priority sampling.
    * @default []
    */
  var rules: js.UndefOr[js.Array[SamplingRule]] = js.native
  /**
    * Sample rate to apply globally when no other rule is matched. Omit to fallback on the dynamic rates returned by the agent instead.
    */
  var sampleRate: js.UndefOr[Number] = js.native
}

object RateLimit {
  @scala.inline
  def apply(): RateLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateLimit]
  }
  @scala.inline
  implicit class RateLimitOps[Self <: RateLimit] (val x: Self) extends AnyVal {
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
    def setRateLimit(value: Number): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    @scala.inline
    def setRulesVarargs(value: SamplingRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[SamplingRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSampleRate(value: Number): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
  
}

