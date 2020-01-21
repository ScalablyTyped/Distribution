package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskResult extends js.Object {
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.native
}

object GetDiskResult {
  @scala.inline
  def apply(disk: Disk = null): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    if (disk != null) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskResult]
  }
}

