package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicOptions extends js.Object {
  /**
    * put request body.
    */
  var data: String = js.native
  /**
    * cached calendar object etag.
    */
  var etag: String = js.native
  /**
    * http method.
    */
  var method: String = js.native
}

object BasicOptions {
  @scala.inline
  def apply(data: String, etag: String, method: String): BasicOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicOptions]
  }
  @scala.inline
  implicit class BasicOptionsOps[Self <: BasicOptions] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

