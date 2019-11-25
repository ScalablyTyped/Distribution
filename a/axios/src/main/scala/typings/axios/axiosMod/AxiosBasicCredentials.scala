package typings.axios.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosBasicCredentials extends js.Object {
  var password: String
  var username: String
}

object AxiosBasicCredentials {
  @scala.inline
  def apply(password: String, username: String): AxiosBasicCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AxiosBasicCredentials]
  }
}

