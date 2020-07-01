package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageVersionDescription extends js.Object {
  /**
    *  The name of the package that is displayed. The displayName varies depending on the package version's format. For example, if an npm package is named ui, is in the namespace vue, and has the format npm, then the displayName is @vue/ui. 
    */
  var displayName: js.UndefOr[String255] = js.native
  /**
    *  The format of the package version. The valid package formats are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The homepage associated with the package. 
    */
  var homePage: js.UndefOr[String] = js.native
  /**
    *  Information about licenses associated with the package version. 
    */
  var licenses: js.UndefOr[LicenseInfoList] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The name of the requested package. 
    */
  var packageName: js.UndefOr[PackageName] = js.native
  /**
    *  A timestamp that contains the date and time the package version was published. 
    */
  var publishedTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The revision of the package version. 
    */
  var revision: js.UndefOr[PackageVersionRevision] = js.native
  /**
    *  The repository for the source code in the package version, or the source code used to build it. 
    */
  var sourceCodeRepository: js.UndefOr[String] = js.native
  /**
    *  A string that contains the status of the package version. It can be one of the following:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: js.UndefOr[PackageVersionStatus] = js.native
  /**
    *  A summary of the package version. The summary is extracted from the package. The information in and detail level of the summary depends on the package version's format. 
    */
  var summary: js.UndefOr[String] = js.native
  /**
    *  The version of the package. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
}

object PackageVersionDescription {
  @scala.inline
  def apply(
    displayName: String255 = null,
    format: PackageFormat = null,
    homePage: String = null,
    licenses: LicenseInfoList = null,
    namespace: PackageNamespace = null,
    packageName: PackageName = null,
    publishedTime: Timestamp = null,
    revision: PackageVersionRevision = null,
    sourceCodeRepository: String = null,
    status: PackageVersionStatus = null,
    summary: String = null,
    version: PackageVersion = null
  ): PackageVersionDescription = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (homePage != null) __obj.updateDynamic("homePage")(homePage.asInstanceOf[js.Any])
    if (licenses != null) __obj.updateDynamic("licenses")(licenses.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (publishedTime != null) __obj.updateDynamic("publishedTime")(publishedTime.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sourceCodeRepository != null) __obj.updateDynamic("sourceCodeRepository")(sourceCodeRepository.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionDescription]
  }
}

