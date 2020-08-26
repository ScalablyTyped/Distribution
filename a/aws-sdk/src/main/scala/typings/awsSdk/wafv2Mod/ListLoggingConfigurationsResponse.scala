package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLoggingConfigurationsResponse extends js.Object {
  /**
    * 
    */
  var LoggingConfigurations: js.UndefOr[typings.awsSdk.wafv2Mod.LoggingConfigurations] = js.native
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
}

object ListLoggingConfigurationsResponse {
  @scala.inline
  def apply(): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
  @scala.inline
  implicit class ListLoggingConfigurationsResponseOps[Self <: ListLoggingConfigurationsResponse] (val x: Self) extends AnyVal {
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
    def setLoggingConfigurationsVarargs(value: LoggingConfiguration*): Self = this.set("LoggingConfigurations", js.Array(value :_*))
    @scala.inline
    def setLoggingConfigurations(value: LoggingConfigurations): Self = this.set("LoggingConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfigurations: Self = this.set("LoggingConfigurations", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

