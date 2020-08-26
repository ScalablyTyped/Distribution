package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportedOs extends js.Object {
  /**
    * The operating system family.
    */
  var Family: js.UndefOr[String] = js.native
  /**
    * The operating system name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The operating system version.
    */
  var Version: js.UndefOr[String] = js.native
}

object ReportedOs {
  @scala.inline
  def apply(): ReportedOs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportedOs]
  }
  @scala.inline
  implicit class ReportedOsOps[Self <: ReportedOs] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("Family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("Family", js.undefined)
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

