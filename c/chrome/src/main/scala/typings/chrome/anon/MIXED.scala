package typings.chrome.anon

import typings.chrome.chromeStrings.mixed
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIXED extends js.Object {
  var MIXED: mixed
  var NORMAL: normal
  var OFF: off
}

object MIXED {
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal, OFF: off): MIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIXED]
  }
}

