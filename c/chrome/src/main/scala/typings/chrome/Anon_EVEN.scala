package typings.chrome

import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EVEN extends js.Object {
  var EVEN: even
  var NO: no
  var ODD: odd
}

object Anon_EVEN {
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): Anon_EVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN, NO = NO, ODD = ODD)
  
    __obj.asInstanceOf[Anon_EVEN]
  }
}

