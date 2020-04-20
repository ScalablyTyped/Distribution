package typings.coreDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateOption extends js.Object {
  var url: String
}

object DeprecateOption {
  @scala.inline
  def apply(url: String): DeprecateOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateOption]
  }
}

