package typings.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var Body: String
  var Header: String
}

object Anon_Body {
  @scala.inline
  def apply(Body: String, Header: String): Anon_Body = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

