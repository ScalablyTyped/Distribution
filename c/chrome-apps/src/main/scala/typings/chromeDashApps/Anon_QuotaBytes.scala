package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QuotaBytes extends js.Object {
  var quotaBytes: integer
  var usageBytes: integer
}

object Anon_QuotaBytes {
  @scala.inline
  def apply(quotaBytes: integer, usageBytes: integer): Anon_QuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes, usageBytes = usageBytes)
  
    __obj.asInstanceOf[Anon_QuotaBytes]
  }
}

