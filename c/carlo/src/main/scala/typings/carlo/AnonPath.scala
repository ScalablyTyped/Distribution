package typings.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  /**
    * absolute path to the given file
    */
  var path: String
}

object AnonPath {
  @scala.inline
  def apply(path: String): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

