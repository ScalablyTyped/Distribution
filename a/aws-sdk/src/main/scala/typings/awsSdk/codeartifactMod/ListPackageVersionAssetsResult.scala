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
  def apply(): ListPackageVersionAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionAssetsResult]
  }
  @scala.inline
  implicit class ListPackageVersionAssetsResultOps[Self <: ListPackageVersionAssetsResult] (val x: Self) extends AnyVal {
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
    def setAssetsVarargs(value: AssetSummary*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: AssetSummaryList): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
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
    def setVersion(value: PackageVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionRevision(value: PackageVersionRevision): Self = this.set("versionRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionRevision: Self = this.set("versionRevision", js.undefined)
  }
  
}

