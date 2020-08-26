package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detector extends js.Object {
  /**
    * The time the detector (instance) was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the detector model that created this detector (instance).
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  /**
    * The version of the detector model that created this detector (instance).
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  /**
    * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
  /**
    * The time the detector (instance) was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current state of the detector (instance).
    */
  var state: js.UndefOr[DetectorState] = js.native
}

object Detector {
  @scala.inline
  def apply(): Detector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detector]
  }
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelName: Self = this.set("detectorModelName", js.undefined)
    @scala.inline
    def setDetectorModelVersion(value: DetectorModelVersion): Self = this.set("detectorModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelVersion: Self = this.set("detectorModelVersion", js.undefined)
    @scala.inline
    def setKeyValue(value: KeyValue): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setState(value: DetectorState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

