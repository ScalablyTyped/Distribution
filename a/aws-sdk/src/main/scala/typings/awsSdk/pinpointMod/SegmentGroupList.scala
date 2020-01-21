package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroupList extends js.Object {
  /**
    * An array that defines the set of segment criteria to evaluate when handling segment groups for the segment.
    */
  var Groups: js.UndefOr[ListOfSegmentGroup] = js.native
  /**
    * Specifies how to handle multiple segment groups for the segment. For example, if the segment includes three segment groups, whether the resulting segment includes endpoints that match all, any, or none of the segment groups.
    */
  var Include: js.UndefOr[typings.awsSdk.pinpointMod.Include] = js.native
}

object SegmentGroupList {
  @scala.inline
  def apply(Groups: ListOfSegmentGroup = null, Include: Include = null): SegmentGroupList = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentGroupList]
  }
}

