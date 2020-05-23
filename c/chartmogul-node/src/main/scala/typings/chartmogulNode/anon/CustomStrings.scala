package typings.chartmogulNode.anon

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStrings extends js.Object {
  var custom: Strings
}

object CustomStrings {
  @scala.inline
  def apply(custom: Strings): CustomStrings = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStrings]
  }
}

