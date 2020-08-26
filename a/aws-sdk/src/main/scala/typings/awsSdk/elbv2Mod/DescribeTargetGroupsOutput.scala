package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetGroupsOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Information about the target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroups] = js.native
}

object DescribeTargetGroupsOutput {
  @scala.inline
  def apply(): DescribeTargetGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetGroupsOutput]
  }
  @scala.inline
  implicit class DescribeTargetGroupsOutputOps[Self <: DescribeTargetGroupsOutput] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroup*): Self = this.set("TargetGroups", js.Array(value :_*))
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = this.set("TargetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroups: Self = this.set("TargetGroups", js.undefined)
  }
  
}

