package typings.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyInfo extends js.Object {
  var installedVersion: String | Null
  var isInstalled: Boolean | Null
  var isValid: Boolean | Null
  var pkgPath: String
  var supportedRange: String | Null
}

object DependencyInfo {
  @scala.inline
  def apply(
    pkgPath: String,
    installedVersion: String = null,
    isInstalled: Boolean = null.asInstanceOf[Boolean],
    isValid: Boolean = null.asInstanceOf[Boolean],
    supportedRange: String = null
  ): DependencyInfo = {
    val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], isInstalled = isInstalled.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], supportedRange = supportedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyInfo]
  }
}

