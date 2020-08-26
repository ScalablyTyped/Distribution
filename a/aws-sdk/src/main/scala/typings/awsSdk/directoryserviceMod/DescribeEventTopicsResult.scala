package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsResult extends js.Object {
  /**
    * A list of SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[typings.awsSdk.directoryserviceMod.EventTopics] = js.native
}

object DescribeEventTopicsResult {
  @scala.inline
  def apply(): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
  @scala.inline
  implicit class DescribeEventTopicsResultOps[Self <: DescribeEventTopicsResult] (val x: Self) extends AnyVal {
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
    def setEventTopicsVarargs(value: EventTopic*): Self = this.set("EventTopics", js.Array(value :_*))
    @scala.inline
    def setEventTopics(value: EventTopics): Self = this.set("EventTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTopics: Self = this.set("EventTopics", js.undefined)
  }
  
}

