package typings.babylonjs.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  var replace: String
  var search: RegExp
}

object Replace {
  @scala.inline
  def apply(replace: String, search: RegExp): Replace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
}

