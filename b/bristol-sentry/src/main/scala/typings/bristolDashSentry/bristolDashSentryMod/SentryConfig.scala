package typings.bristolDashSentry.bristolDashSentryMod

import typings.raven.ravenMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentryConfig extends js.Object {
  var client: js.UndefOr[js.Object | Client] = js.undefined
}

object SentryConfig {
  @scala.inline
  def apply(client: js.Object | Client = null): SentryConfig = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentryConfig]
  }
}

