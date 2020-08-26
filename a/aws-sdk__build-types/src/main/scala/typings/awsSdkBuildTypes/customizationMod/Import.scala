package typings.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Import extends js.Object {
  /**
    * The name of the package to import (as would be used with `npm install`).
    */
  @JSName("package")
  var _package: String = js.native
  /**
    * The version constraint to require. This value should use standard semver
    * notation with the caveat that "or" operators (`||`) are not permitted.
    */
  var version: String = js.native
}

object Import {
  @scala.inline
  def apply(_package: String, version: String): Import = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  @scala.inline
  implicit class ImportOps[Self <: Import] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

