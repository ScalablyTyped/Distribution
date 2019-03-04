package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
  var uri: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String, uri: java.lang.String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email, name = name, uri = uri)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

