package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Etag extends js.Object {
  var etag: js.Any = js.native
}

object Etag {
  @scala.inline
  def apply(etag: js.Any): Etag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Etag]
  }
  @scala.inline
  implicit class EtagOps[Self <: Etag] (val x: Self) extends AnyVal {
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
    def setEtag(value: js.Any): Self = this.set("etag", value.asInstanceOf[js.Any])
  }
  
}

