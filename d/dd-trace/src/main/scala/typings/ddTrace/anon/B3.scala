package typings.ddTrace.anon

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.browser
import typings.ddTrace.ddTraceStrings.log
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B3 extends js.Object {
  var b3: js.UndefOr[Boolean] = js.native
  /**
    * List of origins to whitelist for distributed tracing. This is used to determine whether to propagate context from the browser for CORS.
    * @default []
    */
  var distributedTracingOriginWhitelist: js.UndefOr[js.Array[String | RegExp]] = js.native
  /**
    * Whether to write traces to log output, rather than send to an agent
    * @default false
    */
  var exporter: js.UndefOr[log | browser | agent] = js.native
  /**
    * Whether to add an auto-generated `runtime-id` tag to spans and metrics.
    * @default false
    */
  var runtimeId: js.UndefOr[Boolean] = js.native
  /**
    * Configuration of the priority sampler. Supports a global config and rules by span name or service name. The first matching rule is applied, and if no rule matches it falls back to the global config or on the rates provided by the agent if there is no global config.
    */
  var sampler: js.UndefOr[RateLimit] = js.native
}

object B3 {
  @scala.inline
  def apply(): B3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[B3]
  }
  @scala.inline
  implicit class B3Ops[Self <: B3] (val x: Self) extends AnyVal {
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
    def setB3(value: Boolean): Self = this.set("b3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB3: Self = this.set("b3", js.undefined)
    @scala.inline
    def setDistributedTracingOriginWhitelistVarargs(value: (String | RegExp)*): Self = this.set("distributedTracingOriginWhitelist", js.Array(value :_*))
    @scala.inline
    def setDistributedTracingOriginWhitelist(value: js.Array[String | RegExp]): Self = this.set("distributedTracingOriginWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributedTracingOriginWhitelist: Self = this.set("distributedTracingOriginWhitelist", js.undefined)
    @scala.inline
    def setExporter(value: log | browser | agent): Self = this.set("exporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporter: Self = this.set("exporter", js.undefined)
    @scala.inline
    def setRuntimeId(value: Boolean): Self = this.set("runtimeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeId: Self = this.set("runtimeId", js.undefined)
    @scala.inline
    def setSampler(value: RateLimit): Self = this.set("sampler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampler: Self = this.set("sampler", js.undefined)
  }
  
}

