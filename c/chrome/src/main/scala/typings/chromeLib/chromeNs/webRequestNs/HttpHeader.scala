package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeader extends js.Object {
  var binaryValue: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object HttpHeader {
  @scala.inline
  def apply(name: java.lang.String, binaryValue: stdLib.ArrayBuffer = null, value: java.lang.String = null): HttpHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HttpHeader]
  }
}

