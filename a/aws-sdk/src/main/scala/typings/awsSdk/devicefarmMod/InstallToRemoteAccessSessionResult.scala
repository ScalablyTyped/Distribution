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
  def apply(appUpload: Upload = null): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (appUpload != null) __obj.updateDynamic("appUpload")(appUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
}

