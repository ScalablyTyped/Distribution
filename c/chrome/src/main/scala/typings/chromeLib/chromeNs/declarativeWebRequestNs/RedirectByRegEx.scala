package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectByRegEx extends js.Object {
  var from: java.lang.String
  var to: java.lang.String
}

object RedirectByRegEx {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): RedirectByRegEx = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[RedirectByRegEx]
  }
}

