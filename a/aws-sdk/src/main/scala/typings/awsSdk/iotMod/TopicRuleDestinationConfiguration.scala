package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDestinationConfiguration extends js.Object {
  /**
    * Configuration of the HTTP URL.
    */
  var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration] = js.native
}

object TopicRuleDestinationConfiguration {
  @scala.inline
  def apply(httpUrlConfiguration: HttpUrlDestinationConfiguration = null): TopicRuleDestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (httpUrlConfiguration != null) __obj.updateDynamic("httpUrlConfiguration")(httpUrlConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDestinationConfiguration]
  }
}

