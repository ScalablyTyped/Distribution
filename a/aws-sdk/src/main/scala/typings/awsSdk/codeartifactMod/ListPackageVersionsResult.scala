package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackageVersionsResult extends js.Object {
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  /**
    *  The default package version to display. This depends on the package format:     For Maven and PyPI packages, it's the most recently published package version.     For npm packages, it's the version referenced by the latest tag. If the latest tag is not set, it's the most recently published package version.   
    */
  var defaultDisplayVersion: js.UndefOr[PackageVersion] = js.native
  /**
    *  A format of the package. Valid package format values are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The returned list of  PackageVersionSummary  objects. 
    */
  var versions: js.UndefOr[PackageVersionSummaryList] = js.native
}

object ListPackageVersionsResult {
  @scala.inline
  def apply(
    _package: PackageName = null,
    defaultDisplayVersion: PackageVersion = null,
    format: PackageFormat = null,
    namespace: PackageNamespace = null,
    nextToken: PaginationToken = null,
    versions: PackageVersionSummaryList = null
  ): ListPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (defaultDisplayVersion != null) __obj.updateDynamic("defaultDisplayVersion")(defaultDisplayVersion.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackageVersionsResult]
  }
}

