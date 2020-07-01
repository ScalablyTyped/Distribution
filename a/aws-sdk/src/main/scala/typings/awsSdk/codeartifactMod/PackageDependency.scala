package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    _package: PackageName = null,
    dependencyType: String = null,
    namespace: PackageNamespace = null,
    versionRequirement: String = null
  ): PackageDependency = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (dependencyType != null) __obj.updateDynamic("dependencyType")(dependencyType.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (versionRequirement != null) __obj.updateDynamic("versionRequirement")(versionRequirement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDependency]
  }
}

