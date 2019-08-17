package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ANY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupMod._SegmentGroup
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentGroupList extends js.Object {
  /**
    * A set of segment criteria to evaluate.
    */
  var Groups: js.UndefOr[js.Array[_SegmentGroup] | Iterable[_SegmentGroup]] = js.undefined
  /**
    * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
    */
  var Include: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
}

object _SegmentGroupList {
  @scala.inline
  def apply(
    Groups: js.Array[_SegmentGroup] | Iterable[_SegmentGroup] = null,
    Include: ALL | ANY | NONE | String = null
  ): _SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentGroupList]
  }
}

