package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryExternalConnectionInfo extends js.Object {
  /**
    *  The name of the external connection associated with a repository. 
    */
  var externalConnectionName: js.UndefOr[ExternalConnectionName] = js.native
  /**
    *  The package format associated with a repository's external connection. The valid package formats are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var packageFormat: js.UndefOr[PackageFormat] = js.native
  /**
    *  The status of the external connection of a repository. There is one valid value, Available. 
    */
  var status: js.UndefOr[ExternalConnectionStatus] = js.native
}

object RepositoryExternalConnectionInfo {
  @scala.inline
  def apply(): RepositoryExternalConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryExternalConnectionInfo]
  }
  @scala.inline
  implicit class RepositoryExternalConnectionInfoOps[Self <: RepositoryExternalConnectionInfo] (val x: Self) extends AnyVal {
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
    def setExternalConnectionName(value: ExternalConnectionName): Self = this.set("externalConnectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalConnectionName: Self = this.set("externalConnectionName", js.undefined)
    @scala.inline
    def setPackageFormat(value: PackageFormat): Self = this.set("packageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageFormat: Self = this.set("packageFormat", js.undefined)
    @scala.inline
    def setStatus(value: ExternalConnectionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

