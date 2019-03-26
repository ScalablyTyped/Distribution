package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
trait NameValuePair extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object NameValuePair {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): NameValuePair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[NameValuePair]
  }
}

