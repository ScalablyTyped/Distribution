package typings.ddTrace.mod

import typings.std.Number
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRule extends js.Object {
  /**
    * Operation name on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String | RegExp] = js.undefined
  /**
    * Sampling rate for this rule.
    */
  var sampleRate: Number
  /**
    * Service on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String | RegExp] = js.undefined
}

object SamplingRule {
  @scala.inline
  def apply(sampleRate: Number, name: String | RegExp = null, service: String | RegExp = null): SamplingRule = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
}

