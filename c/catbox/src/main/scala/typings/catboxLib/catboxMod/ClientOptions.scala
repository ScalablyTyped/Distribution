package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * this will store items under keys that start with this value.
    */
  var partition: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(partition: java.lang.String): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("partition")(partition)
    __obj.asInstanceOf[ClientOptions]
  }
}

