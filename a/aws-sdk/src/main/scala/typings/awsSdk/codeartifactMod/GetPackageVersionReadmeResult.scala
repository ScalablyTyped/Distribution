package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPackageVersionReadmeResult extends js.Object {
  /**
    *  The name of the package that contains the returned readme file. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  /**
    *  The format of the package with the requested readme file. Valid format types are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The text of the returned readme file. 
    */
  var readme: js.UndefOr[String] = js.native
  /**
    *  The version of the package with the requested readme file. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.native
}

object GetPackageVersionReadmeResult {
  @scala.inline
  def apply(
    _package: PackageName = null,
    format: PackageFormat = null,
    namespace: PackageNamespace = null,
    readme: String = null,
    version: PackageVersion = null,
    versionRevision: PackageVersionRevision = null
  ): GetPackageVersionReadmeResult = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionRevision != null) __obj.updateDynamic("versionRevision")(versionRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPackageVersionReadmeResult]
  }
}

