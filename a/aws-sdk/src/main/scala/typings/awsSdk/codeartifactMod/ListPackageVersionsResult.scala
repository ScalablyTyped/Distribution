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
  def apply(): ListPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionsResult]
  }
  @scala.inline
  implicit class ListPackageVersionsResultOps[Self <: ListPackageVersionsResult] (val x: Self) extends AnyVal {
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
    def set_package(value: PackageName): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setDefaultDisplayVersion(value: PackageVersion): Self = this.set("defaultDisplayVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDisplayVersion: Self = this.set("defaultDisplayVersion", js.undefined)
    @scala.inline
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: PackageVersionSummary*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: PackageVersionSummaryList): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

