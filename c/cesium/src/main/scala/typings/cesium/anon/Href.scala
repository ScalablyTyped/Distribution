package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Href extends js.Object {
  var href: String = js.native
  var hreflang: String = js.native
  var length: String = js.native
  var rel: String = js.native
  var title: String = js.native
  var `type`: String = js.native
}

object Href {
  @scala.inline
  def apply(href: String, hreflang: String, length: String, rel: String, title: String, `type`: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hreflang = hreflang.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setHreflang(value: String): Self = this.set("hreflang", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

