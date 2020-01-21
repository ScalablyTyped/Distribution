package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The start time, in Unix time in seconds. For more information see timestamp.
    */
  var FromInclusive: js.UndefOr[AttackTimestamp] = js.native
  /**
    * The end time, in Unix time in seconds. For more information see timestamp.
    */
  var ToExclusive: js.UndefOr[AttackTimestamp] = js.native
}

object TimeRange {
  @scala.inline
  def apply(FromInclusive: AttackTimestamp = null, ToExclusive: AttackTimestamp = null): TimeRange = {
    val __obj = js.Dynamic.literal()
    if (FromInclusive != null) __obj.updateDynamic("FromInclusive")(FromInclusive.asInstanceOf[js.Any])
    if (ToExclusive != null) __obj.updateDynamic("ToExclusive")(ToExclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
}

