package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveContainerSettings extends js.Object {
  var M2tsSettings: js.UndefOr[typings.awsSdk.medialiveMod.M2tsSettings] = js.native
}

object ArchiveContainerSettings {
  @scala.inline
  def apply(M2tsSettings: M2tsSettings = null): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    if (M2tsSettings != null) __obj.updateDynamic("M2tsSettings")(M2tsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
}

