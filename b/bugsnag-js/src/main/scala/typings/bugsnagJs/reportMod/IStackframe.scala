package typings.bugsnagJs.reportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackframe extends js.Object {
  var code: js.UndefOr[js.Object] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var file: String = js.native
  var inProject: js.UndefOr[Boolean] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
}

object IStackframe {
  @scala.inline
  def apply(file: String): IStackframe = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackframe]
  }
  @scala.inline
  implicit class IStackframeOps[Self <: IStackframe] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: js.Object): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    @scala.inline
    def setInProject(value: Boolean): Self = this.set("inProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInProject: Self = this.set("inProject", js.undefined)
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

