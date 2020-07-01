package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageVersionSummary extends js.Object {
  /**
    *  The revision associated with a package version. 
    */
  var revision: js.UndefOr[PackageVersionRevision] = js.native
  /**
    *  A string that contains the status of the package version. It can be one of the following:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: PackageVersionStatus = js.native
  /**
    *  Information about a package version. 
    */
  var version: PackageVersion = js.native
}

object PackageVersionSummary {
  @scala.inline
  def apply(status: PackageVersionStatus, version: PackageVersion, revision: PackageVersionRevision = null): PackageVersionSummary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionSummary]
  }
}

