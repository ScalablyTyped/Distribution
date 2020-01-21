package typings.cloudflareApps.CloudflareApps

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
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginalURL]
  }
}

