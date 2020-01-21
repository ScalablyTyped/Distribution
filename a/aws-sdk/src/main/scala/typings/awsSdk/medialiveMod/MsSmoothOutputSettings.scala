package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothOutputSettings extends js.Object {
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType] = js.native
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.native
}

object MsSmoothOutputSettings {
  @scala.inline
  def apply(H265PackagingType: MsSmoothH265PackagingType = null, NameModifier: string = null): MsSmoothOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (H265PackagingType != null) __obj.updateDynamic("H265PackagingType")(H265PackagingType.asInstanceOf[js.Any])
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothOutputSettings]
  }
}

