package typings.chrome.anon

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ONE extends js.Object {
  var ONE: one
  var TWO: two
}

object ONE {
  @scala.inline
  def apply(ONE: one, TWO: two): ONE = {
    val __obj = js.Dynamic.literal(ONE = ONE.asInstanceOf[js.Any], TWO = TWO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ONE]
  }
}

