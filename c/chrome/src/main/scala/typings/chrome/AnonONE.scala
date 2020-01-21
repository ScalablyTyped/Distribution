package typings.chrome

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonONE extends js.Object {
  var ONE: one
  var TWO: two
}

object AnonONE {
  @scala.inline
  def apply(ONE: one, TWO: two): AnonONE = {
    val __obj = js.Dynamic.literal(ONE = ONE.asInstanceOf[js.Any], TWO = TWO.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonONE]
  }
}

