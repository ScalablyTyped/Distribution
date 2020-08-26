package typings.browserfs.emscriptenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenFileSystemOptions extends js.Object {
  var FS: js.Any = js.native
}

object EmscriptenFileSystemOptions {
  @scala.inline
  def apply(FS: js.Any): EmscriptenFileSystemOptions = {
    val __obj = js.Dynamic.literal(FS = FS.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenFileSystemOptions]
  }
  @scala.inline
  implicit class EmscriptenFileSystemOptionsOps[Self <: EmscriptenFileSystemOptions] (val x: Self) extends AnyVal {
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
    def setFS(value: js.Any): Self = this.set("FS", value.asInstanceOf[js.Any])
  }
  
}

