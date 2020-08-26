package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationSettings extends js.Object {
  /**
    * Settings associated with S3 destination
    */
  var S3Settings: js.UndefOr[S3DestinationSettings] = js.native
}

object DestinationSettings {
  @scala.inline
  def apply(): DestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationSettings]
  }
  @scala.inline
  implicit class DestinationSettingsOps[Self <: DestinationSettings] (val x: Self) extends AnyVal {
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
    def setS3Settings(value: S3DestinationSettings): Self = this.set("S3Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Settings: Self = this.set("S3Settings", js.undefined)
  }
  
}

