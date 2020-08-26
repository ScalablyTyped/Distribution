package typings.browserfs.zipFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipFSOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var zipData: Buffer = js.native
}

object ZipFSOptions {
  @scala.inline
  def apply(zipData: Buffer): ZipFSOptions = {
    val __obj = js.Dynamic.literal(zipData = zipData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFSOptions]
  }
  @scala.inline
  implicit class ZipFSOptionsOps[Self <: ZipFSOptions] (val x: Self) extends AnyVal {
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
    def setZipData(value: Buffer): Self = this.set("zipData", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

