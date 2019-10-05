package typings.cloudflareDashApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalURL extends js.Object {
  var parsed: OriginalURLParsed
  var raw: String
}

object OriginalURL {
  @scala.inline
  def apply(parsed: OriginalURLParsed, raw: String): OriginalURL = {
    val __obj = js.Dynamic.literal(parsed = parsed, raw = raw)
  
    __obj.asInstanceOf[OriginalURL]
  }
}

