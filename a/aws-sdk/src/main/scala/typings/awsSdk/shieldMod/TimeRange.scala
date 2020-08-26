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
  def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  @scala.inline
  implicit class TimeRangeOps[Self <: TimeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromInclusive(value: AttackTimestamp): Self = this.set("FromInclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromInclusive: Self = this.set("FromInclusive", js.undefined)
    @scala.inline
    def setToExclusive(value: AttackTimestamp): Self = this.set("ToExclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToExclusive: Self = this.set("ToExclusive", js.undefined)
  }
  
}

