package typings.botvs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var Body: String
  var Header: String
}

object Body {
  @scala.inline
  def apply(Body: String, Header: String): Body = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

