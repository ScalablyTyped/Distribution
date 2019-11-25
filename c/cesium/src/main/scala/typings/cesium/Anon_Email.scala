package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: String
  var name: String
  var uri: String
}

object Anon_Email {
  @scala.inline
  def apply(email: String, name: String, uri: String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Email]
  }
}

