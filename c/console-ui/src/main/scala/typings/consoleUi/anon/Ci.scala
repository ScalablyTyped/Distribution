package typings.consoleUi.anon

import typings.consoleUi.mod.WriteLevel
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ci extends js.Object {
  var ci: js.UndefOr[Boolean] = js.native
  var errorStream: js.UndefOr[WritableStream] = js.native
  var inputStream: js.UndefOr[ReadableStream] = js.native
  var outputStream: js.UndefOr[WritableStream] = js.native
  var writeLevel: js.UndefOr[WriteLevel] = js.native
}

object Ci {
  @scala.inline
  def apply(): Ci = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ci]
  }
  @scala.inline
  implicit class CiOps[Self <: Ci] (val x: Self) extends AnyVal {
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
    def setCi(value: Boolean): Self = this.set("ci", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCi: Self = this.set("ci", js.undefined)
    @scala.inline
    def setErrorStream(value: WritableStream): Self = this.set("errorStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStream: Self = this.set("errorStream", js.undefined)
    @scala.inline
    def setInputStream(value: ReadableStream): Self = this.set("inputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStream: Self = this.set("inputStream", js.undefined)
    @scala.inline
    def setOutputStream(value: WritableStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputStream: Self = this.set("outputStream", js.undefined)
    @scala.inline
    def setWriteLevel(value: WriteLevel): Self = this.set("writeLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteLevel: Self = this.set("writeLevel", js.undefined)
  }
  
}

