package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp4Settings extends js.Object {
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.native
  /**
    * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
    */
  var CttsVersion: js.UndefOr[integerMin0Max1] = js.native
  /**
    * Inserts a free-space box immediately after the moov box.
    */
  var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.native
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.native
  /**
    * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
    */
  var Mp4MajorBrand: js.UndefOr[string] = js.native
}

object Mp4Settings {
  @scala.inline
  def apply(
    CslgAtom: Mp4CslgAtom = null,
    CttsVersion: Int | Double = null,
    FreeSpaceBox: Mp4FreeSpaceBox = null,
    MoovPlacement: Mp4MoovPlacement = null,
    Mp4MajorBrand: string = null
  ): Mp4Settings = {
    val __obj = js.Dynamic.literal()
    if (CslgAtom != null) __obj.updateDynamic("CslgAtom")(CslgAtom.asInstanceOf[js.Any])
    if (CttsVersion != null) __obj.updateDynamic("CttsVersion")(CttsVersion.asInstanceOf[js.Any])
    if (FreeSpaceBox != null) __obj.updateDynamic("FreeSpaceBox")(FreeSpaceBox.asInstanceOf[js.Any])
    if (MoovPlacement != null) __obj.updateDynamic("MoovPlacement")(MoovPlacement.asInstanceOf[js.Any])
    if (Mp4MajorBrand != null) __obj.updateDynamic("Mp4MajorBrand")(Mp4MajorBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp4Settings]
  }
}

