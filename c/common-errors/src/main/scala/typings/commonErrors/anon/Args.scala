package typings.commonErrors.anon

import typings.commonErrors.mod.Error
import typings.commonErrors.mod.GenerateMessageMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var `extends`: js.UndefOr[Error] = js.native
  var generateMessage: js.UndefOr[GenerateMessageMethod] = js.native
  var globalize: js.UndefOr[Boolean] = js.native
}

object Args {
  @scala.inline
  def apply(): Args = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExtends(value: Error): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setGenerateMessage(value: () => String): Self = this.set("generateMessage", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenerateMessage: Self = this.set("generateMessage", js.undefined)
    @scala.inline
    def setGlobalize(value: Boolean): Self = this.set("globalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalize: Self = this.set("globalize", js.undefined)
  }
  
}

