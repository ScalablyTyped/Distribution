package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveGroupSettings extends js.Object {
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.native
}

object ArchiveGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef, RolloverInterval: js.UndefOr[integerMin1] = js.undefined): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    if (!js.isUndefined(RolloverInterval)) __obj.updateDynamic("RolloverInterval")(RolloverInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
}

