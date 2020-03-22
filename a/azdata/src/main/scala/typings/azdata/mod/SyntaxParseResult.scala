package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxParseResult extends js.Object {
  var errors: js.Array[String]
  var parseable: Boolean
}

object SyntaxParseResult {
  @scala.inline
  def apply(errors: js.Array[String], parseable: Boolean): SyntaxParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyntaxParseResult]
  }
}

