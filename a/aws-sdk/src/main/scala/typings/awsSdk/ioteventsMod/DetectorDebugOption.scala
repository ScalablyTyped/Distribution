package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorDebugOption extends js.Object {
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The value of the input attribute key used to create the detector (the instance of the detector model).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}

object DetectorDebugOption {
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DetectorDebugOption = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorDebugOption]
  }
  @scala.inline
  implicit class DetectorDebugOptionOps[Self <: DetectorDebugOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyValue(value: KeyValue): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
  }
  
}

