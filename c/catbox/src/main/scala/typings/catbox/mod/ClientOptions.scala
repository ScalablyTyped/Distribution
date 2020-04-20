package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * this will store items under keys that start with this value.
    */
  var partition: String
}

object ClientOptions {
  @scala.inline
  def apply(partition: String): ClientOptions = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

