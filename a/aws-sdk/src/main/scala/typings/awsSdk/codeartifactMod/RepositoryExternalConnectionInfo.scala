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
  def apply(
    externalConnectionName: ExternalConnectionName = null,
    packageFormat: PackageFormat = null,
    status: ExternalConnectionStatus = null
  ): RepositoryExternalConnectionInfo = {
    val __obj = js.Dynamic.literal()
    if (externalConnectionName != null) __obj.updateDynamic("externalConnectionName")(externalConnectionName.asInstanceOf[js.Any])
    if (packageFormat != null) __obj.updateDynamic("packageFormat")(packageFormat.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryExternalConnectionInfo]
  }
}

