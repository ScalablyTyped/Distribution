package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstancesResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[typings.awsSdk.ec2Mod.ScheduledInstanceSet] = js.native
}

object DescribeScheduledInstancesResult {
  @scala.inline
  def apply(): DescribeScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesResult]
  }
  @scala.inline
  implicit class DescribeScheduledInstancesResultOps[Self <: DescribeScheduledInstancesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = this.set("ScheduledInstanceSet", js.Array(value :_*))
    @scala.inline
    def setScheduledInstanceSet(value: ScheduledInstanceSet): Self = this.set("ScheduledInstanceSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledInstanceSet: Self = this.set("ScheduledInstanceSet", js.undefined)
  }
  
}

