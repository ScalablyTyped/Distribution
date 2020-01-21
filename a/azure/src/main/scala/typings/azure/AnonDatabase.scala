package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatabase extends js.Object {
  var database: String
  var password: String
  var server: String
  var user: String
}

object AnonDatabase {
  @scala.inline
  def apply(database: String, password: String, server: String, user: String): AnonDatabase = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatabase]
  }
}

