package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QuotaBytes extends js.Object {
  var quotaBytes: chromeDashAppsLib.chromeNs.integer
  var usageBytes: chromeDashAppsLib.chromeNs.integer
}

object Anon_QuotaBytes {
  @scala.inline
  def apply(quotaBytes: chromeDashAppsLib.chromeNs.integer, usageBytes: chromeDashAppsLib.chromeNs.integer): Anon_QuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes, usageBytes = usageBytes)
  
    __obj.asInstanceOf[Anon_QuotaBytes]
  }
}

