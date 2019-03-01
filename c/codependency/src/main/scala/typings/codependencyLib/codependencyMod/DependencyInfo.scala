package typings
package codependencyLib.codependencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyInfo extends js.Object {
  var installedVersion: java.lang.String | scala.Null
  var isInstalled: scala.Boolean | scala.Null
  var isValid: scala.Boolean | scala.Null
  var pkgPath: java.lang.String
  var supportedRange: java.lang.String | scala.Null
}

object DependencyInfo {
  @scala.inline
  def apply(
    pkgPath: java.lang.String,
    installedVersion: java.lang.String = null,
    isInstalled: js.UndefOr[scala.Boolean] = js.undefined,
    isValid: js.UndefOr[scala.Boolean] = js.undefined,
    supportedRange: java.lang.String = null
  ): DependencyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pkgPath")(pkgPath)
    if (installedVersion != null) __obj.updateDynamic("installedVersion")(installedVersion)
    if (!js.isUndefined(isInstalled)) __obj.updateDynamic("isInstalled")(isInstalled)
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid)
    if (supportedRange != null) __obj.updateDynamic("supportedRange")(supportedRange)
    __obj.asInstanceOf[DependencyInfo]
  }
}

