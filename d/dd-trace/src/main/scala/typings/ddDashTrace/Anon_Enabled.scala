package typings.ddDashTrace

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  /**
    * Whether to enable Trace Analytics.
    * @default false
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Global sample rate.
    * @default 1
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
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
  var sampleRates: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    sampleRate: Int | Double = null,
    sampleRates: StringDictionary[Double] = null
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleRates != null) __obj.updateDynamic("sampleRates")(sampleRates)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

