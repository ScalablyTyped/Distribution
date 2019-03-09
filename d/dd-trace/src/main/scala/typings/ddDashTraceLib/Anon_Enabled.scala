package typings
package ddDashTraceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  /**
    * Whether to enable Trace Analytics.
    * @default false
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Global sample rate.
    * @default 1
    */
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sample rate by operation name.
    *
    * For example:
    *
    * ```javascript
    * sampleRates: {
    *   'express.request': 0.1
    * }
    * ```
    */
  var sampleRates: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    sampleRate: scala.Int | scala.Double = null,
    sampleRates: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleRates != null) __obj.updateDynamic("sampleRates")(sampleRates)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

