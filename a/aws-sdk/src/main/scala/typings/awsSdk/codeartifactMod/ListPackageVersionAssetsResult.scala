package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackageVersionAssetsResult extends js.Object {
  /**
    *  The name of the package that contains the returned package version assets. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  /**
    *  The returned list of  AssetSummary  objects. 
    */
  var assets: js.UndefOr[AssetSummaryList] = js.native
  /**
    *  The format of the package that contains the returned package version assets. 
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
    *  The version of the package associated with the returned assets. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.native
}

object ListPackageVersionAssetsResult {
  @scala.inline
  def apply(
    _package: PackageName = null,
    assets: AssetSummaryList = null,
    format: PackageFormat = null,
    namespace: PackageNamespace = null,
    nextToken: PaginationToken = null,
    version: PackageVersion = null,
    versionRevision: PackageVersionRevision = null
  ): ListPackageVersionAssetsResult = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionRevision != null) __obj.updateDynamic("versionRevision")(versionRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackageVersionAssetsResult]
  }
}

