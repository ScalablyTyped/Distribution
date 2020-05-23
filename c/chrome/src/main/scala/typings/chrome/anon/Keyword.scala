package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyword extends js.Object {
  var keyword: String
}

object Keyword {
  @scala.inline
  def apply(keyword: String): Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
}

