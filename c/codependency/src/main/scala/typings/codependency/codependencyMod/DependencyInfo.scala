package typings.codependency.codependencyMod

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
    isInstalled: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    supportedRange: String = null
  ): DependencyInfo = {
    val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any])
    if (installedVersion != null) __obj.updateDynamic("installedVersion")(installedVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(isInstalled)) __obj.updateDynamic("isInstalled")(isInstalled.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (supportedRange != null) __obj.updateDynamic("supportedRange")(supportedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyInfo]
  }
}

