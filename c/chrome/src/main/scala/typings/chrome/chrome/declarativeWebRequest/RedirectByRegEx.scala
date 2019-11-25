package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectByRegEx extends js.Object {
  var from: String
  var to: String
}

object RedirectByRegEx {
  @scala.inline
  def apply(from: String, to: String): RedirectByRegEx = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RedirectByRegEx]
  }
}

