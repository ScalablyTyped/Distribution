package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryLimitsResult extends js.Object {
  /**
    * A DirectoryLimits object that contains the directory limits for the current rRegion.
    */
  var DirectoryLimits: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryLimits] = js.native
}

object GetDirectoryLimitsResult {
  @scala.inline
  def apply(DirectoryLimits: DirectoryLimits = null): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryLimits != null) __obj.updateDynamic("DirectoryLimits")(DirectoryLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
}

