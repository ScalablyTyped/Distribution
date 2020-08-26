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
  def apply(status: PackageVersionStatus, version: PackageVersion): PackageVersionSummary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionSummary]
  }
  @scala.inline
  implicit class PackageVersionSummaryOps[Self <: PackageVersionSummary] (val x: Self) extends AnyVal {
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
    def setStatus(value: PackageVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: PackageVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: PackageVersionRevision): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

