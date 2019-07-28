package typings.catbox.catboxMod

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
    val __obj = js.Dynamic.literal(partition = partition)
  
    __obj.asInstanceOf[ClientOptions]
  }
}

