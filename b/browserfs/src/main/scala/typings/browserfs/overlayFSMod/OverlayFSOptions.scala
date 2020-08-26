package typings.browserfs.overlayFSMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayFSOptions extends js.Object {
  var readable: FileSystem = js.native
  var writable: FileSystem = js.native
}

object OverlayFSOptions {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): OverlayFSOptions = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayFSOptions]
  }
  @scala.inline
  implicit class OverlayFSOptionsOps[Self <: OverlayFSOptions] (val x: Self) extends AnyVal {
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
    def setReadable(value: FileSystem): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: FileSystem): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}

