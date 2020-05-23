package typings.chrome.anon

import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EVEN extends js.Object {
  var EVEN: even
  var NO: no
  var ODD: odd
}

object EVEN {
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): EVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EVEN]
  }
}

