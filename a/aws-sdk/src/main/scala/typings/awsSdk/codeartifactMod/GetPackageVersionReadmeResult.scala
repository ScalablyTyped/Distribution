package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetPackageVersionReadmeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionReadmeResult]
  }
  
  @scala.inline
  implicit class GetPackageVersionReadmeResultOps[Self <: GetPackageVersionReadmeResult] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setReadme(value: String): Self = this.set("readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadme: Self = this.set("readme", js.undefined)
    
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
