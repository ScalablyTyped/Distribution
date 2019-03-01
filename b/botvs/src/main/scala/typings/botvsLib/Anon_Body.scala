package typings
package botvsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var Body: java.lang.String
  var Header: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(Body: java.lang.String, Header: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Body")(Body)
    __obj.updateDynamic("Header")(Header)
    __obj.asInstanceOf[Anon_Body]
  }
}

