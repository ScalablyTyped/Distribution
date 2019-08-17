package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentReference extends js.Object {
  /**
    * A unique identifier for the segment.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * If specified contains a specific version of the segment included.
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object _SegmentReference {
  @scala.inline
  def apply(Id: String = null, Version: Int | Double = null): _SegmentReference = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentReference]
  }
}

