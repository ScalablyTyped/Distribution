package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackageVersionDependenciesResult extends js.Object {
  /**
    *  The name of the package that contains the returned package versions dependencies. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  /**
    *  The returned list of  PackageDependency  objects. 
    */
  var dependencies: js.UndefOr[PackageDependencyList] = js.native
  /**
    *  A format that specifies the type of the package that contains the returned dependencies. The valid values are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The version of the package that is specified in the request. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.native
}

object ListPackageVersionDependenciesResult {
  @scala.inline
  def apply(): ListPackageVersionDependenciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionDependenciesResult]
  }
  @scala.inline
  implicit class ListPackageVersionDependenciesResultOps[Self <: ListPackageVersionDependenciesResult] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: PackageDependency*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: PackageDependencyList): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
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

