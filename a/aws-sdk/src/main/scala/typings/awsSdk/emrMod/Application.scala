package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /**
    * This option is for advanced users only. This is meta information about third-party applications that third-party vendors use for testing purposes.
    */
  var AdditionalInfo: js.UndefOr[StringMap] = js.native
  /**
    * Arguments for Amazon EMR to pass to the application.
    */
  var Args: js.UndefOr[StringList] = js.native
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The version of the application.
    */
  var Version: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
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
    def setAdditionalInfo(value: StringMap): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: StringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

