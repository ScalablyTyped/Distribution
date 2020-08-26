package typings.bufferstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /*
    if true and the source is a child_process the stream will block the entire process (timeouts wont work anymore, but splitting and listening on data still works, because they work sync)
    */
  var blocking: js.UndefOr[Boolean] = js.native
  /*
    immediately call disable
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /*
    default encoding for writing strings
    */
  var encoding: js.UndefOr[String] = js.native
  /*
    defines buffer level or sets buffer to given size (see ↓setSize for more)
    */
  var size: js.UndefOr[js.Any] = js.native
  /*
    short form for:
    split(token, function (chunk) {emit('data', chunk)})
    */
  // String or Buffer
  var split: js.UndefOr[js.Any] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
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
    def setBlocking(value: Boolean): Self = this.set("blocking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocking: Self = this.set("blocking", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: js.Any): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
  
}

