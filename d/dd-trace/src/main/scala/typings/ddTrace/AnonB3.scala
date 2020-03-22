package typings.ddTrace

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.browser
import typings.ddTrace.ddTraceStrings.log
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonB3 extends js.Object {
  var b3: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to write traces to log output, rather than send to an agent
    * @default false
    */
  var exporter: js.UndefOr[log | browser | agent] = js.undefined
  /**
    * List of peer service URLs that will be called by this service. This is used to determine whether to send the distributed context from the browser.
    * @default []
    */
  var peers: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
    * Whether to add an auto-generated `runtime-id` tag to spans and metrics.
    * @default false
    */
  var runtimeId: js.UndefOr[Boolean] = js.undefined
  /**
    * Configuration of the priority sampler. Supports a global config and rules by span name or service name. The first matching rule is applied, and if no rule matches it falls back to the global config or on the rates provided by the agent if there is no global config.
    */
  var sampler: js.UndefOr[AnonRateLimit] = js.undefined
}

object AnonB3 {
  @scala.inline
  def apply(
    b3: js.UndefOr[Boolean] = js.undefined,
    exporter: log | browser | agent = null,
    peers: js.Array[String | RegExp] = null,
    runtimeId: js.UndefOr[Boolean] = js.undefined,
    sampler: AnonRateLimit = null
  ): AnonB3 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b3)) __obj.updateDynamic("b3")(b3.asInstanceOf[js.Any])
    if (exporter != null) __obj.updateDynamic("exporter")(exporter.asInstanceOf[js.Any])
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeId)) __obj.updateDynamic("runtimeId")(runtimeId.asInstanceOf[js.Any])
    if (sampler != null) __obj.updateDynamic("sampler")(sampler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonB3]
  }
}

