package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageInfo extends js.Object {
  var codemirror_mode: js.UndefOr[String | ICodeMirrorMode] = js.native
  var mimetype: js.UndefOr[String] = js.native
  var name: String = js.native
  var version: js.UndefOr[String] = js.native
}

object ILanguageInfo {
  @scala.inline
  def apply(name: String): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
  @scala.inline
  implicit class ILanguageInfoOps[Self <: ILanguageInfo] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodemirror_mode(value: String | ICodeMirrorMode): Self = this.set("codemirror_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodemirror_mode: Self = this.set("codemirror_mode", js.undefined)
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimetype: Self = this.set("mimetype", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

