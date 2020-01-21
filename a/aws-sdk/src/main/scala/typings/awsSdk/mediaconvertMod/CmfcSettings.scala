package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmfcSettings extends js.Object {
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[CmfcScte35Esam] = js.native
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[CmfcScte35Source] = js.native
}

object CmfcSettings {
  @scala.inline
  def apply(Scte35Esam: CmfcScte35Esam = null, Scte35Source: CmfcScte35Source = null): CmfcSettings = {
    val __obj = js.Dynamic.literal()
    if (Scte35Esam != null) __obj.updateDynamic("Scte35Esam")(Scte35Esam.asInstanceOf[js.Any])
    if (Scte35Source != null) __obj.updateDynamic("Scte35Source")(Scte35Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmfcSettings]
  }
}

