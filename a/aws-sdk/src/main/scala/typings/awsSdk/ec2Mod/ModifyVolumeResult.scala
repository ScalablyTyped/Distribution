package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVolumeResult extends js.Object {
  /**
    * Information about the volume modification.
    */
  var VolumeModification: js.UndefOr[typings.awsSdk.ec2Mod.VolumeModification] = js.native
}

object ModifyVolumeResult {
  @scala.inline
  def apply(): ModifyVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVolumeResult]
  }
  @scala.inline
  implicit class ModifyVolumeResultOps[Self <: ModifyVolumeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVolumeModification(value: VolumeModification): Self = this.set("VolumeModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeModification: Self = this.set("VolumeModification", js.undefined)
  }
  
}

