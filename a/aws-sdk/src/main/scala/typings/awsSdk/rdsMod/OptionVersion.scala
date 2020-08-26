package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionVersion extends js.Object {
  /**
    * True if the version is the default version of the option, and otherwise false.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The version of the option.
    */
  var Version: js.UndefOr[String] = js.native
}

object OptionVersion {
  @scala.inline
  def apply(): OptionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionVersion]
  }
  @scala.inline
  implicit class OptionVersionOps[Self <: OptionVersion] (val x: Self) extends AnyVal {
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
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

