package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerOptions extends ListOptions[ListElementStyle] {
  /**
    * Current working directory.
    */
  var cwd: js.UndefOr[String] = js.native
}

object FileManagerOptions {
  @scala.inline
  def apply(): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerOptions]
  }
  @scala.inline
  implicit class FileManagerOptionsOps[Self <: FileManagerOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
  }
  
}

