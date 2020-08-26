package typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod.SegmentGroup
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroupList extends js.Object {
  /**
    * A set of segment criteria to evaluate.
    */
  var Groups: js.UndefOr[js.Array[SegmentGroup] | Iterable[SegmentGroup]] = js.native
  /**
    * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
    */
  var Include: js.UndefOr[ALL | ANY | NONE | String] = js.native
}

object SegmentGroupList {
  @scala.inline
  def apply(): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroupList]
  }
  @scala.inline
  implicit class SegmentGroupListOps[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: SegmentGroup*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[SegmentGroup] | Iterable[SegmentGroup]): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setInclude(value: ALL | ANY | NONE | String): Self = this.set("Include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("Include", js.undefined)
  }
  
}

