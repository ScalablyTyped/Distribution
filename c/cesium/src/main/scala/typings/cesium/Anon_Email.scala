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
    val __obj = js.Dynamic.literal(email = email, name = name, uri = uri)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

