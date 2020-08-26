package typings.browserfs.browserfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemConfiguration extends js.Object {
  var fs: String = js.native
  var options: js.Any = js.native
}

object FileSystemConfiguration {
  @scala.inline
  def apply(fs: String, options: js.Any): FileSystemConfiguration = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemConfiguration]
  }
  @scala.inline
  implicit class FileSystemConfigurationOps[Self <: FileSystemConfiguration] (val x: Self) extends AnyVal {
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
    def setFs(value: String): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

