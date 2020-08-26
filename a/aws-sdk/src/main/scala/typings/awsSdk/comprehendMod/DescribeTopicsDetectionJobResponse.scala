package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTopicsDetectionJobResponse extends js.Object {
  /**
    * The list of properties for the requested job.
    */
  var TopicsDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.TopicsDetectionJobProperties] = js.native
}

object DescribeTopicsDetectionJobResponse {
  @scala.inline
  def apply(): DescribeTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeTopicsDetectionJobResponseOps[Self <: DescribeTopicsDetectionJobResponse] (val x: Self) extends AnyVal {
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
    def setTopicsDetectionJobProperties(value: TopicsDetectionJobProperties): Self = this.set("TopicsDetectionJobProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicsDetectionJobProperties: Self = this.set("TopicsDetectionJobProperties", js.undefined)
  }
  
}

