package typings.carlo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  /**
    * absolute path to the given file
    */
  var path: String
}

object Path {
  @scala.inline
  def apply(path: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

