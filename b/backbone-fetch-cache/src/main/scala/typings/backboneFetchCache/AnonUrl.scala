package typings.backboneFetchCache

import typings.backboneFetchCache.mod._GetCacheKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends _GetCacheKeyOptions {
  var url: String
}

object AnonUrl {
  @scala.inline
  def apply(url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

