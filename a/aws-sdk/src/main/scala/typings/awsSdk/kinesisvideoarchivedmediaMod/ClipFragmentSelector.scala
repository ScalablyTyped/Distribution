package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipFragmentSelector extends js.Object {
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: ClipFragmentSelectorType = js.native
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: ClipTimestampRange = js.native
}

object ClipFragmentSelector {
  @scala.inline
  def apply(FragmentSelectorType: ClipFragmentSelectorType, TimestampRange: ClipTimestampRange): ClipFragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipFragmentSelector]
  }
}

