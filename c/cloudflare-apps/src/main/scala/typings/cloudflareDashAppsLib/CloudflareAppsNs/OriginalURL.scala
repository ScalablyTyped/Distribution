package typings
package cloudflareDashAppsLib.CloudflareAppsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalURL extends js.Object {
  var parsed: OriginalURLParsed
  var raw: java.lang.String
}

object OriginalURL {
  @scala.inline
  def apply(parsed: OriginalURLParsed, raw: java.lang.String): OriginalURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parsed")(parsed)
    __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[OriginalURL]
  }
}

