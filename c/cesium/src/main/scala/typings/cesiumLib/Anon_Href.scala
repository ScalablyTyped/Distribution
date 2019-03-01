package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var hreflang: java.lang.String
  var length: java.lang.String
  var rel: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
}

object Anon_Href {
  @scala.inline
  def apply(
    href: java.lang.String,
    hreflang: java.lang.String,
    length: java.lang.String,
    rel: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String
  ): Anon_Href = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("hreflang")(hreflang)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("rel")(rel)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Href]
  }
}

