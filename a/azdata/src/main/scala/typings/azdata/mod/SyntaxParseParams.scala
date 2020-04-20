package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxParseParams extends js.Object {
  var ownerUri: String
  var query: String
}

object SyntaxParseParams {
  @scala.inline
  def apply(ownerUri: String, query: String): SyntaxParseParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseParams]
  }
}

