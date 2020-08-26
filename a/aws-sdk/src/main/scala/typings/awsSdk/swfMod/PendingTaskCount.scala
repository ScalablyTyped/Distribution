package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingTaskCount extends js.Object {
  /**
    * The number of tasks in the task list.
    */
  var count: Count = js.native
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.native
}

object PendingTaskCount {
  @scala.inline
  def apply(count: Count): PendingTaskCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingTaskCount]
  }
  @scala.inline
  implicit class PendingTaskCountOps[Self <: PendingTaskCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Count): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncated(value: Truncated): Self = this.set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
  }
  
}

