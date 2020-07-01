package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageSummary extends js.Object {
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  /**
    *  The format of the package. Valid values are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
}

object PackageSummary {
  @scala.inline
  def apply(_package: PackageName = null, format: PackageFormat = null, namespace: PackageNamespace = null): PackageSummary = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageSummary]
  }
}

