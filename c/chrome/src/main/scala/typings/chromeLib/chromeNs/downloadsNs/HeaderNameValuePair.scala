package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderNameValuePair extends js.Object {
  /** Name of the HTTP header. */
  var name: java.lang.String
  /** Value of the HTTP header. */
  var value: java.lang.String
}

object HeaderNameValuePair {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): HeaderNameValuePair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[HeaderNameValuePair]
  }
}

