package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  /**
    * The name of the package to import (as would be used with `npm install`).
    */
  var `package`: String
  /**
    * The version constraint to require. This value should use standard semver
    * notation with the caveat that "or" operators (`||`) are not permitted.
    */
  var version: String
}

object Import {
  @scala.inline
  def apply(`package`: String, version: String): Import = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
}

