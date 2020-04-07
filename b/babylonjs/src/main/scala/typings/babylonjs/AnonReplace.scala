package typings.babylonjs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplace extends js.Object {
  var replace: String
  var search: RegExp
}

object AnonReplace {
  @scala.inline
  def apply(replace: String, search: RegExp): AnonReplace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReplace]
  }
}

