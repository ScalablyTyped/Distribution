package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTimeValue extends js.Object {
  /**
    *  Contains an integer specifying time in minutes.   Valid values: 15 minutes. 
    */
  var Minutes: js.UndefOr[typings.awsSdk.s3Mod.Minutes] = js.native
}

object ReplicationTimeValue {
  @scala.inline
  def apply(Minutes: js.UndefOr[Minutes] = js.undefined): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Minutes)) __obj.updateDynamic("Minutes")(Minutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTimeValue]
  }
}

