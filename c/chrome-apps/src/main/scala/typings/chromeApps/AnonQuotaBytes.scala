package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuotaBytes extends js.Object {
  var quotaBytes: integer
  var usageBytes: integer
}

object AnonQuotaBytes {
  @scala.inline
  def apply(quotaBytes: integer, usageBytes: integer): AnonQuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes.asInstanceOf[js.Any], usageBytes = usageBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuotaBytes]
  }
}

