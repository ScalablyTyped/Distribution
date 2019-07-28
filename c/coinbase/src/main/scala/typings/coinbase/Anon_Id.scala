package typings.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var message: String
  var url: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, message: String, url: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, message = message, url = url)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

