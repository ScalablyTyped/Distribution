package typings.browserSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  var stream: Boolean = js.native
}

object Stream {
  @scala.inline
  def apply(stream: Boolean): Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

