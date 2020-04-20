package typings.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var Body: String
  var Header: String
}

object AnonBody {
  @scala.inline
  def apply(Body: String, Header: String): AnonBody = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

