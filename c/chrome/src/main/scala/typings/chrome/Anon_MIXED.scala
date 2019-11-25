package typings.chrome

import typings.chrome.chromeStrings.mixed
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MIXED extends js.Object {
  var MIXED: mixed
  var NORMAL: normal
  var OFF: off
}

object Anon_MIXED {
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal, OFF: off): Anon_MIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MIXED]
  }
}

