package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterVolumeResult extends js.Object {
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object RegisterVolumeResult {
  @scala.inline
  def apply(): RegisterVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterVolumeResult]
  }
  @scala.inline
  implicit class RegisterVolumeResultOps[Self <: RegisterVolumeResult] (val x: Self) extends AnyVal {
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
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
  }
  
}

