package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var hreflang: String
  var length: String
  var rel: String
  var title: String
  var `type`: String
}

object Anon_Href {
  @scala.inline
  def apply(href: String, hreflang: String, length: String, rel: String, title: String, `type`: String): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hreflang = hreflang.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

