package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionProviderOptions extends js.Object {
  var options: js.Array[ConnectionOption]
}

object ConnectionProviderOptions {
  @scala.inline
  def apply(options: js.Array[ConnectionOption]): ConnectionProviderOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProviderOptions]
  }
}

