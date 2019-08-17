package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ANY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupMod._UnmarshalledSegmentGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentGroupList extends _SegmentGroupList {
  /**
    * A set of segment criteria to evaluate.
    */
  @JSName("Groups")
  var Groups__UnmarshalledSegmentGroupList: js.UndefOr[js.Array[_UnmarshalledSegmentGroup]] = js.undefined
}

object _UnmarshalledSegmentGroupList {
  @scala.inline
  def apply(Groups: js.Array[_UnmarshalledSegmentGroup] = null, Include: ALL | ANY | NONE | String = null): _UnmarshalledSegmentGroupList = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentGroupList]
  }
}

