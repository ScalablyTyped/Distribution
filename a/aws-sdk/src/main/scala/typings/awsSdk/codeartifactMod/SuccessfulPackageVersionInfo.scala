package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessfulPackageVersionInfo extends js.Object {
  /**
    *  The revision of a package version. 
    */
  var revision: js.UndefOr[String] = js.native
  /**
    *  The status of a package version. Valid statuses are:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: js.UndefOr[PackageVersionStatus] = js.native
}

object SuccessfulPackageVersionInfo {
  @scala.inline
  def apply(revision: String = null, status: PackageVersionStatus = null): SuccessfulPackageVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulPackageVersionInfo]
  }
}

