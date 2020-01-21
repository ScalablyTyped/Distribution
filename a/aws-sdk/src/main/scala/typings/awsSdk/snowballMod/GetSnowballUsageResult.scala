package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnowballUsageResult extends js.Object {
  /**
    * The service limit for number of Snowballs this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.native
  /**
    * The number of Snowballs that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.native
}

object GetSnowballUsageResult {
  @scala.inline
  def apply(SnowballLimit: Int | Double = null, SnowballsInUse: Int | Double = null): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    if (SnowballLimit != null) __obj.updateDynamic("SnowballLimit")(SnowballLimit.asInstanceOf[js.Any])
    if (SnowballsInUse != null) __obj.updateDynamic("SnowballsInUse")(SnowballsInUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
}

