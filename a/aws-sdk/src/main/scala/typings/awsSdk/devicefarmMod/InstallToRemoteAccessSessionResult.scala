package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallToRemoteAccessSessionResult extends js.Object {
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[Upload] = js.native
}

object InstallToRemoteAccessSessionResult {
  @scala.inline
  def apply(): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
  @scala.inline
  implicit class InstallToRemoteAccessSessionResultOps[Self <: InstallToRemoteAccessSessionResult] (val x: Self) extends AnyVal {
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
    def setAppUpload(value: Upload): Self = this.set("appUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppUpload: Self = this.set("appUpload", js.undefined)
  }
  
}

