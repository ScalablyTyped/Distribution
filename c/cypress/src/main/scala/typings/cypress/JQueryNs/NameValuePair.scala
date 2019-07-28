package typings.cypress.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
trait NameValuePair extends js.Object {
  var name: String
  var value: String
}

object NameValuePair {
  @scala.inline
  def apply(name: String, value: String): NameValuePair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[NameValuePair]
  }
}

