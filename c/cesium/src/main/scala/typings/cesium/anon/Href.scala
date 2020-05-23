package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var hreflang: String
  var length: String
  var rel: String
  var title: String
  var `type`: String
}

object Href {
  @scala.inline
  def apply(href: String, hreflang: String, length: String, rel: String, title: String, `type`: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hreflang = hreflang.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

