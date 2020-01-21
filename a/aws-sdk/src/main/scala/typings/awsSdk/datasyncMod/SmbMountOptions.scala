package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmbMountOptions extends js.Object {
  /**
    * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version, DataSync defaults to AUTOMATIC. That is, DataSync automatically selects a version based on negotiation with the SMB server.
    */
  var Version: js.UndefOr[SmbVersion] = js.native
}

object SmbMountOptions {
  @scala.inline
  def apply(Version: SmbVersion = null): SmbMountOptions = {
    val __obj = js.Dynamic.literal()
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmbMountOptions]
  }
}

