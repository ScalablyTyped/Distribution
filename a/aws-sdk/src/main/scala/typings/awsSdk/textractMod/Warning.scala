package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  /**
    * The error code for the warning.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.textractMod.ErrorCode] = js.native
  /**
    * A list of the pages that the warning applies to.
    */
  var Pages: js.UndefOr[typings.awsSdk.textractMod.Pages] = js.native
}

object Warning {
  @scala.inline
  def apply(): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warning]
  }
  @scala.inline
  implicit class WarningOps[Self <: Warning] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setPagesVarargs(value: UInteger*): Self = this.set("Pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: Pages): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("Pages", js.undefined)
  }
  
}

