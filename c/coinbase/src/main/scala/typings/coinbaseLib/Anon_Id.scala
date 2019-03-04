package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var message: java.lang.String
  var url: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, message: java.lang.String, url: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, message = message, url = url)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

