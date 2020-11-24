package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageDependency extends js.Object {
  
  /**
    *  The name of the package that this package depends on. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  
  /**
    *  The type of a package dependency. The possible values depend on the package type. Example types are compile, runtime, and test for Maven packages, and dev, prod, and optional for npm packages. 
    */
  var dependencyType: js.UndefOr[String] = js.native
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  
  /**
    *  The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: 1.2.3, ^2.3.4, or 4.x. 
    */
  var versionRequirement: js.UndefOr[String] = js.native
}
object PackageDependency {
  
  @scala.inline
  def apply(): PackageDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDependency]
  }
  
  @scala.inline
  implicit class PackageDependencyOps[Self <: PackageDependency] (val x: Self) extends AnyVal {
    
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
    def setDependencyType(value: String): Self = this.set("dependencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyType: Self = this.set("dependencyType", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setVersionRequirement(value: String): Self = this.set("versionRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionRequirement: Self = this.set("versionRequirement", js.undefined)
  }
}
