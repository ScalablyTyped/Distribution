package typings.codemirror

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimeType extends js.Object {
  var alias: js.UndefOr[js.Array[String]] = js.native
  var ext: js.UndefOr[js.Array[String]] = js.native
  var file: js.UndefOr[RegExp] = js.native
  var mime: js.UndefOr[String] = js.native
  var mimes: js.UndefOr[String] = js.native
  var mode: String = js.native
  var name: String = js.native
}

object MimeType {
  @scala.inline
  def apply(mode: String, name: String): MimeType = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
  @scala.inline
  implicit class MimeTypeOps[Self <: MimeType] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setExtVarargs(value: String*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: js.Array[String]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setFile(value: RegExp): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setMimes(value: String): Self = this.set("mimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimes: Self = this.set("mimes", js.undefined)
  }
  
}

