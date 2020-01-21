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
  def apply(LoggingConfigurations: LoggingConfigurations = null, NextMarker: NextMarker = null): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfigurations != null) __obj.updateDynamic("LoggingConfigurations")(LoggingConfigurations.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
}

